package com.Assignments;

import java.util.Scanner;


public class Area_Perimeter_Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Area of circle \n" + "2. Area of triangle \n" + "3. Area of rectangle \n" + "4. Area Of Isosceles Triangle \n" + "5. Area Of Parallelogram \n" + "6. Area Of Rhombus \n" + "7. Area Of Equilateral Triangle \n" + "8. Perimeter Of Circle \n" + "9. Perimeter Of Equilateral Triangle \n" + "10. Perimeter Of Parallelogram \n" + "11. Perimeter Of Rectangle \n" + "12. Perimeter Of Square \n" + "13. Perimeter Of Rhombus \n" + "14. Volume Of Cone \n" + "15. Volume Of Prism \n" + "16. Volume Of Cylinder \n" + "17. Volume Of Sphere \n" + "18. Volume Of Pyramid \n" + "19. Curved Surface Area Of Cylinder \n" + "20. Total Surface Area Of Cube \n" + "21. Exit \n");
            System.out.println("Enter the Choice to perform operation : ");
            int ch = sc.nextInt();

            if(ch==1){
                System.out.println("Enter the radius size : ");
                double r = sc.nextDouble();
                double area_of_circle = 3.14*r*r;
                System.out.println("Area of circle is : " + area_of_circle);
            }

            else if(ch==2){
                System.out.println("Enter base size : ");
                double base = sc.nextDouble();
                System.out.println("Enter height of a triangle : ");
                double height = sc.nextDouble();
                double area_of_triangle = (base*height)/2;
                System.out.println("Area of Triangle : " +area_of_triangle);
            }

            else if (ch==3) {
                System.out.println("Enter length : ");
                double l = sc.nextDouble();
                System.out.println("Enter width : ");
                double w = sc.nextDouble();
                double area_of_rectangle = l*w;
                System.out.println("Area of rectangle : " + area_of_rectangle);
            }

            else if (ch==4) {
                System.out.println("Enter length of two equal sides : ");
                double len = sc.nextDouble();
                System.out.println("Enter base lenght : ");
                double b = sc.nextDouble();
                double area_of_iso_triangle = (b/4)*Math.sqrt((4*len*len)-b*b);
                System.out.println("Area of Isosceles Triangle = " + area_of_iso_triangle);
            }

            else if (ch==5) {
                System.out.println("Enter base lenght : ");
                double plen = sc.nextDouble();
                System.out.println("Ehter height size : ");
                double phei = sc.nextDouble();
                double area_of_paralleogram =  plen*phei;
                System.out.println("Area Of Parallelogram : " + area_of_paralleogram);
            }

            else if (ch==6) {
                System.out.println("Enter the first diagonal size : ");
                double d1 = sc.nextDouble();
                System.out.println("Enter the second diagonal size : ");
                double d2 = sc.nextDouble();
                double area_of_double = (d1*d2)/2;
                System.out.println("Area of the Rhombus : " + area_of_double);
            }

            else if (ch==7) {
                System.out.println("Enter the lengthe of triangle : ");
                double aequ = sc.nextDouble();
                double area_of_equ = (Math.sqrt(3)/4)*aequ*aequ;
                System.out.println("Area of equilateral Triangle : " + area_of_equ);
            }

            else if (ch==8) {
                System.out.println("Enter the radius : ");
                double ridCir = sc.nextDouble();
                double per_of_circle = 2*3.14*ridCir;
                System.out.println("Perimeter of the Circle : "+per_of_circle);
            }

            else if (ch==9) {
                System.out.println("Enter the lenght of triangle : ");
                double euqia = sc.nextDouble();
                double per_of_equ = 3*euqia;
                System.out.println("Perimeter Of Equilateral Triangle : " + per_of_equ);
            }

            else if (ch==10) {
                System.out.println("Enter the lenght : ");
                double paralla = sc.nextDouble();
                System.out.println("Enter the width : ");
                double parallb = sc.nextDouble();
                double per_of_parallelogram = 2*(paralla + parallb);
                System.out.println("Perimeter Of Parallelogram : " + per_of_parallelogram);
            }

            else if (ch==11) {
                System.out.println("Enter the length : ");
                double rectl = sc.nextDouble();
                System.out.println("Enter the width : ");
                double rectb = sc.nextDouble();
                double per_of_rect = 2*(rectb + rectl);
                System.out.println("Perimeter Of Rectangle : " +per_of_rect);
            }

            else if (ch==12) {
                System.out.println("Enter the length : ");
                double squa = sc.nextDouble();
                double per_of_squ = 4*squa;
                System.out.println("Perimeter Of Square : " + per_of_squ);
            }

            else if (ch==13) {
                System.out.println("Enter the length : ");
                double rhoma = sc.nextDouble();
                double per_of_rhombus = 4*rhoma;
                System.out.println("Perimeter Of Rhombus : " + per_of_rhombus);
            }

            else if (ch==14) {
                System.out.println("Enter the radius : ");
                double coner = sc.nextDouble();
                System.out.println("Enter the height : ");
                double conel = sc.nextDouble();
                double volume_of_cone = (3.14*coner*coner*conel)/3;
                System.out.println("Volume Of Cone : " + volume_of_cone);
            }

            else if (ch==15) {
                System.out.println("Enter the base area : ");
                double B = sc.nextDouble();
                System.out.println("Enter the height : ");
                double H = sc.nextDouble();
                double volume_of_prism = B*H;
                System.out.println("Volume Of Prism : " + volume_of_prism);
            }

            else if (ch==16) {
                System.out.println("Enter the radius : ");
                double R = sc.nextDouble();
                System.out.println("Enter the height : ");
                double cylH = sc.nextDouble();
                double vol_of_cylinder = 3.14 * R * R * cylH;
                System.out.println("Volume Of Cylinder : " + vol_of_cylinder);
            }

            else if (ch==17) {
                System.out.println("Enter the radius : " );
                double CylR = sc.nextDouble();
                double vol_of_cylinder = (4*3.14*CylR*CylR*CylR)/3;
                System.out.println("Volume Of Sphere : " + vol_of_cylinder);
            }

            else if (ch==18) {
                System.out.println("Enter the Base area : ");
                double pyB = sc.nextDouble();
                System.out.println("Enter the height : ");
                double pyH= sc.nextDouble();
                double vol_of_pyr = (pyB*pyH)/3;
                System.out.println("Volume Of Pyramid : " + vol_of_pyr);
            }

            else if (ch==19) {
                System.out.println("Enter the radius : ");
                double CUSR = sc.nextDouble();
                System.out.println("Enter the height :");
                double CUSH = sc.nextDouble();
                double cur_sur_area_of_cylinder = 2*3.14*CUSH*CUSR;
                System.out.println("Curved Surface Area Of Cylinder : " +cur_sur_area_of_cylinder);
            }

            else if (ch==20) {
                System.out.println("Enter the length of cube : ");
                double SACL = sc.nextDouble();
                double sur_area_of_cube = 6*SACL*SACL;
                System.out.println("Total Surface Area Of Cube : "+sur_area_of_cube);
            }

            else if (ch==21) {
                System.out.println("Exited from program Sucessfully. Thankyou !!!");
                break;
            }

            else{
                System.out.println("Invalid Choice, Please select correct choice from the menu. Thankyou");
            }
        }
    }
}
