 class Calculator
{
    void Add(int a,int b)
    {
        System.out.println(a+b);
        }
    void Add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void Add(String a,String b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        Calculator obj=new Calculator();
        obj.Add(10,3);
        obj.Add(10,20,30);
        obj.Add("poojitha","Asha",143);
    }
}