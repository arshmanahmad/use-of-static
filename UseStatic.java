class OuterClas{
    String s = "This is how to show to StaticClass";
    static class StaticNestedClass{
       public void display(){
            OuterClass type = new OuterClass();
            System.out.println(type.s);
        }
    }
}
class SecondClass extends FirstClass{
    public void main(String []args){
        OuterClass.StaticNestedClass newObj = new OuterClas.StaticNestedClass();
        newObj.display();
    }
}