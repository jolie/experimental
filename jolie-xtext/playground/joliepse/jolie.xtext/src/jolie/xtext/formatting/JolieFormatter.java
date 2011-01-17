/*
 * generated by Xtext
 */
package jolie.xtext.formatting;

import java.util.List;

import jolie.xtext.services.JolieGrammarAccess;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class JolieFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		JolieGrammarAccess f = (JolieGrammarAccess) getGrammarAccess();

		//c.setAutoLinewrap(150);
		
		c.setLinewrap(1,2,3).around(f.getIncludeRule());
		
		
		//c.setLinewrap(1,2,3).around(f.getInputPortStatementRule());
		//c.setLinewrap(1,2,3).around(f.getOutputPortStatementRule());
		
		c.setLinewrap(1,2,3).around(f.getLocationRule());
		c.setLinewrap(1,2,3).around(f.getInterfacesRule());
		c.setLinewrap(1,2,3).around(f.getProtocolRule());
		c.setLinewrap(1,2,3).around(f.getOneWayOperationRule());
		c.setLinewrap(1,2,3).around(f.getRequestResponseOperationRule());
		c.setLinewrap(1,2,3).around(f.getRedirectsRule());
		c.setLinewrap(1,2,3).around(f.getAggregatesRule());
		
	
		
		
		c.setLinewrap(1,2,3).around(f.getBasicStatementRule());
		c.setNoSpace().around(f.getATRule());
		c.setNoSpace().around(f.getDOTRule());
		c.setNoSpace().before(f.getSEMICOLONRule());
		
		
		//c.setLinewrap(1, 2, 3).around(f.getPackageDeclarationRule());
		//c.setLinewrap(1, 1, 2).around(f.getFeatureRule());
		//c.setNoSpace().before(f.getTypeRefAccess().getMultiAsteriskKeyword_1_0());
		
		List<Pair<Keyword,Keyword>> pairs = f.findKeywordPairs("{", "}");
		for (Pair<Keyword, Keyword> pair : pairs) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
		}
		
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
		
	}
}
