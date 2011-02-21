package jolie.xtext.ui.quickfix;

import jolie.xtext.jolie.JolieFactory;
import jolie.xtext.jolie.VariablePath;
import jolie.xtext.jolie.With;
import jolie.xtext.jolie.impl.VariablePathImpl;

import jolie.xtext.validation.JolieJavaValidator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IRegion;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

public class JolieQuickfixProvider extends DefaultQuickfixProvider {

	// @Fix(MyJavaValidator.INVALID_NAME)
	// public void capitalizeName(final Issue issue, IssueResolutionAcceptor
	// acceptor) {
	// acceptor.accept(issue, "Capitalize name", "Capitalize the name.",
	// "upcase.png", new IModification() {
	// public void apply(IModificationContext context) throws
	// BadLocationException {
	// IXtextDocument xtextDocument = context.getXtextDocument();
	// String firstLetter = xtextDocument.get(issue.getOffset(), 1);
	// xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
	// }
	// });
	// }

	@Fix(JolieJavaValidator.PREFIXED_WITHOUT_WITH_BLOCK)
	public void fixFeatureName(final Issue issue,
			IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Delete the dot",
				"Delete the dot '" + issue.getData()[0] + "'", "upcase.png",
				// exemplary semantic modification

				new IModification() {
					public void apply(IModificationContext context) {

						IXtextDocument xtextDocument = context
								.getXtextDocument();
						try {
							xtextDocument.replace(issue.getOffset() - 1, 1, "");
						} catch (BadLocationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				});
		
		
		

	}
}

/*
 * protected boolean createWithStatement(With sibling, String name) { With with
 * = JolieFactory.eINSTANCE.createWith();
 * 
 * return addTypeAsSibling(sibling, with); }
 */

