package jolie.lang.parse.ast.types;

import java.util.LinkedList;
import java.util.List;
import jolie.lang.NativeType;
import jolie.lang.parse.OLVisitor;
import jolie.lang.parse.context.ParsingContext;
import jolie.util.Range;

/**
 *
 * @author julie
 */
public class TypeChoiceDefinition extends TypeDefinition {
	
	private final List< TypeDefinition > options;
	private String regex = null;
	
	public TypeChoiceDefinition( ParsingContext context, String id, Range cardinality, List<TypeDefinition> options)
	{
		super( context, id, cardinality );
		this.options = options;
	}
	
	public List<TypeDefinition> options()
	{
		return options;
	}

	@Override
	public String toRegex()
	{
		if ( regex == null) {	//Initialize regex if not already initialized.
			regex = id() + ":";
			
			for( int i = 0; i < options.size()-1 ; i++ ) {
				regex += options.get(i).toRegex() + "+";
			}
			regex += options.get(options.size()).toRegex();
		}
		return regex;
	}
	
	@Override
	public void accept(OLVisitor visitor)
	{
		visitor.visit( this );
	}
}
