
class Parallelogram extends Quadrilateral{  //ƽ���ı���

   private double bottomSide;
   private double slantSide;
   private double height;

   public Parallelogram(double bottomSide, double slantSide, double height){

       this.bottomSide = bottomSide;
       this.slantSide = slantSide;
       this.height = height;
   }
   public String describe(){

   	   return "This is a parallelogram, with ";
   }
   public void accept(Visitor v){
       v.visitParallelogram(this);
   }
   public void accept(Visitor2 v){
       v.visit(this);
   }

   public double getPerimeter(){
       return 2*(bottomSide + slantSide);
   }
   public double getArea(){

       double area = bottomSide*height;
       return area;
   }

   //���нӿ�
   public double getBottomSide(){
       return bottomSide;
   }
   public double getSlantSide(){
       return slantSide;
   }
   public double getHeight(){
       return height;
   }
}