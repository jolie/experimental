package jolie.xtext.ui.quickfix;

import jolie.xtext.jolie.BasicStatement;
import jolie.xtext.jolie.JolieFactory;
import jolie.xtext.jolie.MainProcess;
import jolie.xtext.jolie.VariablePath;
import jolie.xtext.jolie.With;
import jolie.xtext.jolie.impl.AssignStatementOrPostIncrementDecrementOrInputOperationImpl;
import jolie.xtext.jolie.impl.SequenceStatementImpl;
import jolie.xtext.jolie.impl.VariablePathImpl;
import jolie.xtext.services.JolieGrammarAccess.AssignStatementOrPostIncrementDecrementOrInputOperationElements;
import jolie.xtext.services.JolieGrammarAccess.BasicStatementElements;
import jolie.xtext.services.JolieGrammarAccess.SequenceStatementElements;
import jolie.xtext.services.JolieGrammarAccess.VariablePathElements;
import jolie.xtext.validation.JolieJavaValidator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.util.Strings;
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
		acceptor.accept(issue, "Delete the dot", "Uncapitalize name of '"
				+ issue.getData()[0] + "'", "upcase.png",
		// exemplary semantic modification

				new ISemanticModification() {
					public void apply(EObject element,
							IModificationContext context) {

						EObject container = element.eContainer(); // Il container della variabile,
												// dovrebbe essere un basic
												// state

						element = (VariablePathImpl) element;
						
						System.out.println("sssssssssssssssssssssssssssss"
								+ container.toString());
						/*
						elements = ((AssignStatementOrPostIncrementDecrementOrInputOperationElements) container).g.getElements();
						
						VariablePathImpl vp = (VariablePathImpl) element;
						//vp.getName().clear();
						vp.getName().set(0, null);
						
						
						EList<AbstractElement> elements = null;
						if (container instanceof PackageDeclaration) {
							elements = ((PackageDeclaration) container).getElements();
						
						// L'indice del basic nella lista di basicStat di quel
						// Parallel
						//int index = elements.indexOf(element.eContainer()
						//		.eContainer()) + 1;
						
						/*With with = JolieFactory.eINSTANCE.createWith();
						
						VariablePath vp = JolieFactory.eINSTANCE.createVariablePath();
						
						
						vp.getName().add("diego");
						
						with.setName(vp);
						
						MainProcess mp=JolieFactory.eINSTANCE.createMainProcess();
						
						with.setMainrocess(mp);
						System.out.println("sssssssssssssssssssssssssssss"+
								vp.getName());
					      */
						
						
					
					

					}
				});
	}

	/*
	 * protected boolean createWithStatement(With sibling, String name) { With
	 * with = JolieFactory.eINSTANCE.createWith();
	 * 
	 * return addTypeAsSibling(sibling, with); }
	 */
}
