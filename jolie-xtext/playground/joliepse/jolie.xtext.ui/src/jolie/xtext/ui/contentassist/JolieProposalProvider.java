/*
* generated by Xtext
*/
package jolie.xtext.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import jolie.xtext.ui.contentassist.AbstractJolieProposalProvider;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class JolieProposalProvider extends AbstractJolieProposalProvider {
   
	@Override
	public void completeAssignStatementOrPostIncrementDecrementOrInputOperation_RightSide(EObject model,
			Assignment assignment, ContentAssistContext context,
			final ICompletionProposalAcceptor acceptor) {
		super.completeAssignStatementOrPostIncrementDecrementOrInputOperation_RightSide( 
			    model, 
			    assignment, 
			    context, 
			    acceptor);   
		
			/*public void accept(ICompletionProposal proposal) {
				if (proposal instanceof ConfigurableCompletionProposal) {
					ConfigurableCompletionProposal ccp = (ConfigurableCompletionProposal) proposal;
					String string = ccp.getReplacementString();
					int indexOfOpenPar = string.indexOf('(');
					if (indexOfOpenPar!=-1) {
						int oldSelectionStart = ccp.getSelectionStart();
						ccp.setSelectionStart(oldSelectionStart-string.length()+indexOfOpenPar+1);
						ccp.setSelectionLength(oldSelectionStart-ccp.getSelectionStart()-1);
					}
				}
				acceptor.accept(proposal);*/
		
		 String proposal = "++"; 
		  // convert it to a valid STRING-terminal 
		 // proposal = getValueConverter().toString(proposal, "STRING"); 
		  // create the completion proposal 
		  // the result may be null as the createCompletionProposal(..) methods 
		  // check for valid prefixes 
		  // and terminal token conflicts 
		  ICompletionProposal completionProposal = 
		    createCompletionProposal(proposal, context); 
		  acceptor.accept(completionProposal);
		  
		  
		  proposal=" = ";
		  completionProposal = 
			    createCompletionProposal(proposal, context); 
		  // register the proposal, the acceptor handles null-values gracefully 
		  acceptor.accept(completionProposal);
		  
		  proposal="++";
		  completionProposal = 
			    createCompletionProposal(proposal, context); 
		  // register the proposal, the acceptor handles null-values gracefully 
		  acceptor.accept(completionProposal);
		  
		  proposal="--";
		  completionProposal = 
			    createCompletionProposal(proposal, context); 
		  // register the proposal, the acceptor handles null-values gracefully 
		  acceptor.accept(completionProposal);
		  
		  proposal="@";
		  completionProposal = 
			    createCompletionProposal(proposal, context); 
		  // register the proposal, the acceptor handles null-values gracefully 
		  acceptor.accept(completionProposal);
		  
		  proposal=" -> ";
		  completionProposal = 
			    createCompletionProposal(proposal, context); 
		  // register the proposal, the acceptor handles null-values gracefully 
		  acceptor.accept(completionProposal);
		  
		  proposal=" << ";
		  completionProposal = 
			    createCompletionProposal(proposal, context); 
		  // register the proposal, the acceptor handles null-values gracefully 
		  acceptor.accept(completionProposal);
		  
		  proposal="[  ";
		  completionProposal = 
			    createCompletionProposal(proposal, context); 
		  // register the proposal, the acceptor handles null-values gracefully 
		  acceptor.accept(completionProposal);
		  
		
			}

			
			
		
	}
	

	

