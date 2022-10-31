public class Main {
    public static void main(String[] args) {
        int[] a = new int[15];
        int z=16;
        for (int i=0; i<a.length; i++){
            a[i]=z--;
            System.out.print(a[i]+" ");
        }
        System.out.println();
        double[] x = new double[20];
        for (int i=0; i<x.length; i++){
            x[i] = Math.random() * 11.0 - 7.0;
            System.out.print(x[i]+" ");
        }
        System.out.println();
        double[][] d=new double[15][20];
        for(int i=0;i<15;i++){
            for(int j=0;j<20;j++){
                double f=x[j];
                if(a[i]==9) d[i][j]=Math.pow(Math.pow(Math.pow(f,f/4),1/3),((Math.pow(Math.pow((f-1)/f,f),1/3))+1/3)/(Math.cos(Math.atan((f-1.5)/11))));
                else if(a[i]==2 | a[i]==3 | a[i]==4 | a[i]==10 | a[i]==12 | a[i]==13 | a[i]==16) d[i][j]=Math.pow(Math.pow((Math.pow(f,((2/3)-f)/4))+1/(Math.asin((f-1.5)/11)),2)*Math.PI,3);
                else d[i][j]=(Math.atan(Math.pow(Math.E,Math.pow(-Math.abs(f),1/3))))/(Math.tan(Math.pow(Math.pow(Math.E,f),1/3*Math.pow(1-f,f)))-1/3);
                System.out.printf("%.2f",d[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}