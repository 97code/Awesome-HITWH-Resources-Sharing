
class RightTriangle extends Triangle{  //ֱ��������

   private double width;
   private double height;

   public RightTriangle(double width,double height){
       super (width, height,Math.sqrt( width*width + height*height));
       this.width = width;
       this.height = height;
   }
   public String describe(){

   	   return "This is a right triangle, with ";
   }
   public void accept(Visitor v){
       v.visitRightTriangle(this);
   }
   public void accept(Visitor2 v){
       v.visit(this);
   }
   public double getPerimeter(){
       return (width + height + Math.sqrt( width*width + height*height));
   }
   public double getArea(){
       double area = (width*height)/2;
       return area;
   }
   //���нӿ�
   public double getWidth(){
       return width;
   }
   public double getHeight(){
       return height;
   }

}