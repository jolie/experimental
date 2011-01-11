package jolie.xtext.ui.navigation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jolie.xtext.jolie.JoliePackage;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.IViewPart;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import jolie.xtext.jolie.Include;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Provides hyperlinks in LilyPond source editors.
 */
public class JolieHyperlinkHelper extends HyperlinkHelper {

        @Inject
        private Provider<XtextHyperlink> hyperlinkProvider;

        @Override
        public IHyperlink[] createHyperlinksByOffset(XtextResource xtextResource, int offset, boolean createMultipleHyperlinks) {
                // Get default hyperlinks
                IHyperlink[] defaultHyperlinks = super.createHyperlinksByOffset(xtextResource, offset, createMultipleHyperlinks);
                List<IHyperlink> hyperlinks;
                if (defaultHyperlinks == null) {
                        hyperlinks = new ArrayList<IHyperlink>();
                } else {
                        hyperlinks = Arrays.asList(defaultHyperlinks);
                }
                // Add hyperlinks
                AbstractNode node = NodeUtil.findLeafNodeAtOffset(xtextResource.getParseResult().getRootNode(), offset + 1);
                EObject object = NodeUtil.getNearestSemanticObject(node);
                int nodeOffset = node.getOffset();
                int nodeLength = node.getLength();
                // Include -> File
                if ((object instanceof Include) && NodeUtil.findNodesForFeature(object, JoliePackage.eINSTANCE.getInclude_ImportURI()).contains(node)) {
                        Include include = (Include)object;
                        Resource includedEResource = EcoreUtil2.getResource(xtextResource, include.getImportURI());
                        
                                int linkOffset = nodeOffset + 1; // Ignore the surrounding quotation marks
                                int linkLength = nodeLength - 2;
                                if ((linkOffset <= offset) && (offset < linkOffset + linkLength)) {
                                        XtextHyperlink hyperlink = hyperlinkProvider.get();
                                        hyperlink.setHyperlinkRegion(new Region(linkOffset, linkLength));
                                        hyperlink.setHyperlinkText("Open included file");
                                        URI importUri = includedEResource.getURI();
                                        hyperlink.setURI(importUri);
                                        hyperlinks.add(hyperlink);
                                
                        }
                }
              
                if (hyperlinks.isEmpty()) { // Must return null instead of empty array if there are no hyperlinks
                        return null;
                } else {
                        return Iterables.newArray(hyperlinks, IHyperlink.class);
                }
        }
}