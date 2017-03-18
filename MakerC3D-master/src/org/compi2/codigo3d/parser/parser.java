
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Mar 17 21:56:57 CST 2017
//----------------------------------------------------

package org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Mar 17 21:56:57 CST 2017
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\004\000\002\006\002\000\002\002" +
    "\004\000\002\004\005\000\002\004\005\000\002\004\004" +
    "\000\002\004\005\000\002\004\005\000\002\005\003\000" +
    "\002\005\003\000\002\005\003\000\002\005\003\000\002" +
    "\005\003\000\002\005\003\000\002\003\005\000\002\003" +
    "\005\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\004\000\002\003\005\000\002\003\003\000" +
    "\002\003\003\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\016\004\000\005\000\006\000\010\000\014" +
    "\000\026\000\001\002\000\016\004\007\005\015\006\013" +
    "\010\011\014\014\026\010\001\002\000\004\002\006\001" +
    "\002\000\004\002\001\001\002\000\040\002\uffec\007\uffec" +
    "\010\uffec\011\uffec\012\uffec\013\uffec\015\uffec\016\uffec\017" +
    "\uffec\020\uffec\021\uffec\022\uffec\023\uffec\024\uffec\025\uffec" +
    "\001\002\000\016\004\007\005\015\006\013\010\011\014" +
    "\014\026\010\001\002\000\014\004\007\005\015\006\013" +
    "\010\011\014\033\001\002\000\010\002\uffff\024\046\025" +
    "\050\001\002\000\040\002\uffea\007\uffea\010\uffea\011\uffea" +
    "\012\uffea\013\uffea\015\uffea\016\uffea\017\uffea\020\uffea\021" +
    "\uffea\022\uffea\023\uffea\024\uffea\025\uffea\001\002\000\016" +
    "\004\007\005\015\006\013\010\011\014\014\026\010\001" +
    "\002\000\040\002\uffeb\007\uffeb\010\uffeb\011\uffeb\012\uffeb" +
    "\013\uffeb\015\uffeb\016\uffeb\017\uffeb\020\uffeb\021\uffeb\022" +
    "\uffeb\023\uffeb\024\uffeb\025\uffeb\001\002\000\030\007\026" +
    "\010\020\011\022\012\030\013\021\016\031\017\032\020" +
    "\024\021\023\022\025\023\017\001\002\000\014\004\ufff4" +
    "\005\ufff4\006\ufff4\010\ufff4\014\ufff4\001\002\000\014\004" +
    "\007\005\015\006\013\010\011\014\033\001\002\000\014" +
    "\004\007\005\015\006\013\010\011\014\033\001\002\000" +
    "\014\004\007\005\015\006\013\010\011\014\033\001\002" +
    "\000\014\004\ufff6\005\ufff6\006\ufff6\010\ufff6\014\ufff6\001" +
    "\002\000\014\004\ufff7\005\ufff7\006\ufff7\010\ufff7\014\ufff7" +
    "\001\002\000\014\004\ufff5\005\ufff5\006\ufff5\010\ufff5\014" +
    "\ufff5\001\002\000\014\004\007\005\015\006\013\010\011" +
    "\014\033\001\002\000\014\004\007\005\015\006\013\010" +
    "\011\014\033\001\002\000\014\004\007\005\015\006\013" +
    "\010\011\014\033\001\002\000\014\004\ufff9\005\ufff9\006" +
    "\ufff9\010\ufff9\014\ufff9\001\002\000\014\004\ufff8\005\ufff8" +
    "\006\ufff8\010\ufff8\014\ufff8\001\002\000\014\004\007\005" +
    "\015\006\013\010\011\014\033\001\002\000\040\002\ufff0" +
    "\007\ufff0\010\ufff0\011\ufff0\012\ufff0\013\021\015\ufff0\016" +
    "\ufff0\017\ufff0\020\ufff0\021\ufff0\022\ufff0\023\ufff0\024\ufff0" +
    "\025\ufff0\001\002\000\016\007\026\010\020\011\022\012" +
    "\030\013\021\015\036\001\002\000\040\002\uffed\007\uffed" +
    "\010\uffed\011\uffed\012\uffed\013\uffed\015\uffed\016\uffed\017" +
    "\uffed\020\uffed\021\uffed\022\uffed\023\uffed\024\uffed\025\uffed" +
    "\001\002\000\024\002\ufffa\007\026\010\020\011\022\012" +
    "\030\013\021\015\ufffa\024\ufffa\025\ufffa\001\002\000\040" +
    "\002\ufff3\007\ufff3\010\ufff3\011\022\012\030\013\021\015" +
    "\ufff3\016\ufff3\017\ufff3\020\ufff3\021\ufff3\022\ufff3\023\ufff3" +
    "\024\ufff3\025\ufff3\001\002\000\040\002\ufff1\007\ufff1\010" +
    "\ufff1\011\ufff1\012\ufff1\013\021\015\ufff1\016\ufff1\017\ufff1" +
    "\020\ufff1\021\ufff1\022\ufff1\023\ufff1\024\ufff1\025\ufff1\001" +
    "\002\000\040\002\uffef\007\uffef\010\uffef\011\uffef\012\uffef" +
    "\013\021\015\uffef\016\uffef\017\uffef\020\uffef\021\uffef\022" +
    "\uffef\023\uffef\024\uffef\025\uffef\001\002\000\040\002\ufff2" +
    "\007\ufff2\010\ufff2\011\022\012\030\013\021\015\ufff2\016" +
    "\ufff2\017\ufff2\020\ufff2\021\ufff2\022\ufff2\023\ufff2\024\ufff2" +
    "\025\ufff2\001\002\000\010\015\047\024\046\025\050\001" +
    "\002\000\032\007\026\010\020\011\022\012\030\013\021" +
    "\015\036\016\031\017\032\020\024\021\023\022\025\023" +
    "\017\001\002\000\016\004\007\005\015\006\013\010\011" +
    "\014\014\026\010\001\002\000\012\002\ufffb\015\ufffb\024" +
    "\ufffb\025\ufffb\001\002\000\016\004\007\005\015\006\013" +
    "\010\011\014\014\026\010\001\002\000\012\002\ufffd\015" +
    "\ufffd\024\046\025\ufffd\001\002\000\012\002\ufffe\015\ufffe" +
    "\024\ufffe\025\ufffe\001\002\000\040\002\uffee\007\uffee\010" +
    "\uffee\011\022\012\030\013\021\015\uffee\016\uffee\017\uffee" +
    "\020\uffee\021\uffee\022\uffee\023\uffee\024\uffee\025\uffee\001" +
    "\002\000\012\002\ufffc\015\ufffc\024\ufffc\025\ufffc\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\006\002\004\006\003\001\001\000\006\003" +
    "\015\004\011\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\003\015\004\053\001\001\000" +
    "\004\003\052\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\003\044\004\043\001\001\000\002\001\001\000" +
    "\004\005\026\001\001\000\002\001\001\000\004\003\042" +
    "\001\001\000\004\003\041\001\001\000\004\003\040\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\003\037\001\001\000\004\003\036\001\001\000" +
    "\004\003\033\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\003\034\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\005\026\001\001\000\006\003\015" +
    "\004\051\001\001\000\002\001\001\000\006\003\015\004" +
    "\050\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


//Codigo visible

    public void syntax_error(Symbol s){
        System.err.println(s);
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.err.println("T.T");
        System.err.println(s);
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {

//Codigo de acciones
      

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expresion ::= DECIMAL 
            {
              NodoC3D RESULT =null;
		int decimalleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int decimalright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String decimal = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(decimal); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expresion ::= ENTERO 
            {
              NodoC3D RESULT =null;
		int enteroleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int enteroright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String entero = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(entero); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expresion ::= ID 
            {
              NodoC3D RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(id); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expresion ::= PAR_IZQ expresion PAR_DER 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = exp; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expresion ::= MENOS expresion 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = - " + exp.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expresion ::= expresion POT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " ^ " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expresion ::= expresion DIV expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " / " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expresion ::= expresion MULT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " * " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expresion ::= expresion MENOS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " - " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expresion ::= expresion MAS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " + " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // relacion ::= MENORIGUAL 
            {
              NodoC3D RESULT =null;
		
    String temp = "<=";
    RESULT = new NodoC3D(temp);


              CUP$parser$result = parser.getSymbolFactory().newSymbol("relacion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // relacion ::= MAYORIGUAL 
            {
              NodoC3D RESULT =null;
		
    String temp = ">=";
    RESULT = new NodoC3D(temp);


              CUP$parser$result = parser.getSymbolFactory().newSymbol("relacion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // relacion ::= MENORQUE 
            {
              NodoC3D RESULT =null;
		
    String temp = "<";
    RESULT = new NodoC3D(temp);


              CUP$parser$result = parser.getSymbolFactory().newSymbol("relacion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // relacion ::= MAYORQUE 
            {
              NodoC3D RESULT =null;
		
    String temp = ">";
    RESULT = new NodoC3D(temp);


              CUP$parser$result = parser.getSymbolFactory().newSymbol("relacion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // relacion ::= DIFERENTE 
            {
              NodoC3D RESULT =null;
		
    String temp = "!=";
    RESULT = new NodoC3D(temp);


              CUP$parser$result = parser.getSymbolFactory().newSymbol("relacion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // relacion ::= IGUAL 
            {
              NodoC3D RESULT =null;
		
    String temp = "==";
    RESULT = new NodoC3D(temp);


              CUP$parser$result = parser.getSymbolFactory().newSymbol("relacion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // condicion ::= expresion relacion expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int enleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int enright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D en = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		

        String cadena = izq.getCad() + en.getCad() + der.getCad();
        RESULT = new NodoC3D(cadena);
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // condicion ::= PAR_IZQ condicion PAR_DER 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = izq; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // condicion ::= NOT condicion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        
        String primero = ControlC3D.generarL();
        String segundo = ControlC3D.generarL();

        String c3d = "if (" + izq.getCad() +") goto " + primero + "\n goto " + segundo + "\n";
        ControlC3D.agregarVerdaderas(segundo);
        ControlC3D.agregarFalsas(primero);
        ControlC3D.agregarC3D(c3d);
        NodoC3D nodo = new NodoC3D(c3d);
        
        RESULT = nodo;
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // condicion ::= condicion OR condicion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        if(izq.isFlag() != null && izq.isFlag()){
            System.out.println("si era un OR");
            String f = ControlC3D.devolverFalsas()  +" : \n";
            ControlC3D.agregarC3D(f);
            ControlC3D.VaciarFalsas();

            String tercero = ControlC3D.generarL();
            String cuarto = ControlC3D.generarL();
            
            String c3d = "if (" + der.getCad() +") goto " + tercero + "\n goto " + cuarto + "\n";
            ControlC3D.agregarVerdaderas(tercero);
            ControlC3D.agregarFalsas(cuarto);
            ControlC3D.agregarC3D(c3d);
            NodoC3D nodo = new NodoC3D("");
            nodo.getIsAndOr(false);
            RESULT = nodo;
        }else if(der.isFlag() != null && der.isFlag()){
                 System.out.println("si era un OR");
            String f = ControlC3D.devolverFalsas()  +" : \n";
            ControlC3D.agregarC3D(f);
            ControlC3D.VaciarFalsas();

            String tercero = ControlC3D.generarL();
            String cuarto = ControlC3D.generarL();
            
            String c3d = "if (" + izq.getCad() +") goto " + tercero + "\n goto " + cuarto + "\n";
            ControlC3D.agregarVerdaderas(tercero);
            ControlC3D.agregarFalsas(cuarto);
            ControlC3D.agregarC3D(c3d);
            NodoC3D nodo = new NodoC3D("");
            nodo.getIsAndOr(false);
            RESULT = nodo;
        
        }else if(izq.isFlag()!= null && izq.isFlag()== false){
            String f = ControlC3D.devolverFalsas() +": \n";
            ControlC3D.agregarC3D(f);
            ControlC3D.VaciarFalsas();

            String tercero = ControlC3D.generarL();
        String cuarto = ControlC3D.generarL();

        String c3d = "if (" + der.getCad() +") goto " + tercero + "\n goto " + cuarto + "\n";
        ControlC3D.agregarVerdaderas(tercero);
        ControlC3D.agregarFalsas(cuarto);
        ControlC3D.agregarC3D(c3d);
        NodoC3D nodo = new NodoC3D("");
        nodo.getIsAndOr(false);
        RESULT = nodo;
            
                
        }else{
        String primero = ControlC3D.generarL();
        String segundo = ControlC3D.generarL();

        String c3d = "if (" + izq.getCad() +") goto " + primero + "\n goto " + segundo + "\n";
        ControlC3D.agregarVerdaderas(primero);
        c3d+= segundo + ": \n";
        
        String tercero = ControlC3D.generarL();
        String cuarto = ControlC3D.generarL();

        c3d += "if (" + der.getCad() +") goto " + tercero + "\n goto " + cuarto + "\n";
        ControlC3D.agregarVerdaderas(tercero);
        ControlC3D.agregarFalsas(cuarto);
        ControlC3D.agregarC3D(c3d);
        NodoC3D nodo = new NodoC3D(c3d);
        nodo.getIsAndOr(false);
        RESULT = nodo;
        }
        
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // condicion ::= condicion AND condicion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		

    
        if(izq.isFlag() != null && izq.isFlag() == false){
            System.out.println("es un or");
            String v = ControlC3D.devolverVerdaderas()  +" : \n";
            ControlC3D.agregarC3D(v);
            ControlC3D.VaciarVerdaderas();

            String tercero = ControlC3D.generarL();
            String cuarto = ControlC3D.generarL();
            
            String c3d = "if (" + der.getCad() +") goto " + tercero + "\n goto " + cuarto + "\n";
            ControlC3D.agregarVerdaderas(tercero);
            ControlC3D.agregarFalsas(cuarto);
            ControlC3D.agregarC3D(c3d);
            NodoC3D nodo = new NodoC3D("");
            nodo.getIsAndOr(true);
            RESULT = nodo;

        }else if(izq.isFlag()!= null && izq.isFlag()){
            String f = ControlC3D.devolverVerdaderas() +": \n";
            ControlC3D.agregarC3D(f);
            ControlC3D.VaciarVerdaderas();

            String tercero = ControlC3D.generarL();
        String cuarto = ControlC3D.generarL();

            String c3d = "if (" + der.getCad() +") goto " + tercero + "\n goto " + cuarto + "\n";
            ControlC3D.agregarVerdaderas(tercero);
            ControlC3D.agregarFalsas(cuarto);
            ControlC3D.agregarC3D(c3d);
            NodoC3D nodo = new NodoC3D("");
            nodo.getIsAndOr(true);
            RESULT = nodo;
            
                
        }else{
            String primero = ControlC3D.generarL();
            String segundo = ControlC3D.generarL();

            String c3d = "if (" + izq.getCad() +") goto " + primero + "\n goto " + segundo + "\n";
            ControlC3D.agregarFalsas(segundo);
            c3d+= primero + ": \n";

            String tercero = ControlC3D.generarL();
            String cuarto = ControlC3D.generarL();

            c3d += "if (" + der.getCad() +") goto " + tercero + "\n goto " + cuarto + "\n";
            ControlC3D.agregarVerdaderas(tercero);
            ControlC3D.agregarFalsas(cuarto);
            ControlC3D.agregarC3D(c3d);
            NodoC3D nodo = new NodoC3D(c3d);
            nodo.getIsAndOr(true);
            RESULT = nodo;
        }

    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicial ::= NT$0 condicion 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String v = ControlC3D.devolverVerdaderas() + " : VERDADERO \n";
                        String f = ControlC3D.devolverFalsas()  +" : FALSAS \n";
                        ControlC3D.agregarC3D(v);
                        ControlC3D.agregarC3D(f);
                        RESULT = exp;
                        //ControlC3D.agregarC3D("//Último valor: " + exp.getCad());
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicial",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              NodoC3D RESULT =null;
 ControlC3D.reiniciar(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicial EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D start_val = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

