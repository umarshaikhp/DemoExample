class A{
public static void main(String args[]){
//System.out.println(args[0]);
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
String s=args[2];
System.out.println(s);
switch(s){
	case "+":
	System.out.println(a+b);
	break;
	
	case "-":
	System.out.println(a-b);
	break;
	case "*":
	System.out.println(a*b);
	break;
	case "/":
	System.out.println(a/b);
	break;
	default:
	System.out.println(a*b);
}


}
}