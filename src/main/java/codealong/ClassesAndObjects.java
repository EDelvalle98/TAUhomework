package codealong;

import java.util.Scanner;

public class ClassesAndObjects {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30,60);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms: " + totalArea);

        ClassesAndObjects calculator = new ClassesAndObjects();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The Total erea is : " + area);

        calculator.scanner.close();

        System.out.println(Month.getMonth(4));
        System.out.println(Month.getMonth("February"));

    }

    public  double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public Rectangle getRoom(){


        System.out.println("Enter the length of your room");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room");
        double width = scanner.nextDouble();



        return new Rectangle(length,width);
    }

    public static class Rectangle {

        private double length;
        private double width;

        public Rectangle (){
            length = 0;
            width = 0;
        }

        public Rectangle (double length, double width){
            setLength(length);//this.length = length (both ways work)
            setWidth(width);
        }

        public double calculatePerimeter(){
            return (2*length) + (2*width);
        }

        public double calculateArea(){
            return length*width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }
    }

    public static class Month {

        public static String getMonth(int month) {
            switch (month) {
                case 1:
                    return "January";
                case 2:
                    return "February";
                case 3:
                    return "March";
                case 4:
                    return "April";
                case 5:
                    return "May";
                case 6:
                    return "June";
                case 7:
                    return "July";
                case 8:
                    return "August";
                case 9:
                    return "September";
                case 10:
                    return "October";
                case 11:
                    return "November";
                case 12:
                    return "December";
                default:
                    return "Invalid month, Please enter a value between 1 and 12";
            }
        }
        public static int getMonth(String month){
                switch (month){
                    case "January": return 1;
                    case "February": return 2;
                    case "March": return 3;
                    case "April": return 4;
                    case "May": return 5;
                    case "June": return 6;
                    case "July": return 7;
                    case "August": return 8;
                    case "September": return 9;
                    case "October": return 10;
                    case "November": return 11;
                    case "December": return 12;
                    default: return -1;
                }
        }
    }
}
