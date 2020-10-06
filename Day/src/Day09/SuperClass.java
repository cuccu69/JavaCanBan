package Day09;

class SuperClass {
    public int testNum;
    public String greeting = "Hello";

    public SuperClass(int number){
        testNum = number;
    }

    public void displayName() {
        System.out.println("SuperClass!");
    }

    public String addString(String addString) {
        return greeting += addString;
    }

    public int addNumber(int number) {
        return testNum + number;
    }
}

class SubClass extends SuperClass {
    public int testNum;
    public String greeting = "Good Bye";

    public SubClass(int number){
        super(2);
        this.testNum = number;
    }

    public void displayName() {
        System.out.println("SubClass!");
    }

    public String addString(String addString) {
        return greeting += addString;
    }

    public int getTestNum() {
        return testNum;
    }

//    public int addNumber(int number) {
//        return testNum + number;
//    }
}

class Main {
    public static void main(String[] args) {
        int additionNumber = 3;
        SubClass obj = new SubClass(5);
        System.out.print(obj.greeting + "\n");
        obj.displayName();

        System.out.println("The result of addNumber method: " + obj.addNumber(additionNumber));
        System.out.println("Addition number is: " + additionNumber);
        System.out.println("This is testNum of subclass: " + ((SubClass)obj).testNum);
        System.out.println("This is testNum of superclass: " + obj.testNum);
        /*
        obj.addNumber;
        cái này hay đó. nó lại liên quan đến dynamic binding trong java. thằng cha phải có phương thức đó thì để thằng
        con overide lại. Khi đó dynamic binding sẽ được áp dụng.
        Thú vị. biến thì nó vẫn lấy của thằng cha nhưng khi gọi phưng thức thì nó lại lấy biến của thằng con. Trường hợp mình
        cmt lại.
        Nếu cả cha và con cùng có 1 tên biến và thằng con overide lại 1 method cua thằng cha thì nếu gọi method của thằng
        con thì nó sẽ dùng chính biến trùng tên của nó. còn trong trường hợp thằng con gọi 1 method(đc định nghĩa ở lớp cha nhưng không overide ở lớp con)
        thì trong trường hợp này nó lại lấy biến trùng tên của thằng cha. Binding sẽ tìm theo tên và signature?????*?

        - Một điều quan trọng nữa:
            + declare type sẽ quyết định các phương thức có thể sử dụng. Và đó là các phương thức trong ở trong declare type only;
            + trường hợp method được referance type overide lại thì nó sẽ gọi theo method của thằng referance type (dynamic binding).

        - Chính vì sự lộn xộn trên nên mình nghĩ người ta sẽ chả bao giờ đặt cha và con có cùng 1 biến làm gì vì khi con tạo ra thì nó đã có sẵn biến đó rồi
        còn gì. Việc tạo lại có thể chỉ là sơ suất mà thôi.

        - Chốt lại: nếu super class và supclass cùng có 1 fiel trùng tên thì:
            + khi gọi 1 method nào đó:
                ++ nếu method được overide lại trong subclass thì nó sẽ dùng biến của thằng con để chạy.
                ++ nếu không overide lại thì nó sẽ dùng giá trị của cha.

                ==>> METHOD CỦA LỚP NÀO SẼ DÙNG DATA FIELD CỦA LỚP ĐÓ. Và nếu gọi data field thì nó gọi theo data field của declare type. Còn gọi method sẽ theo dynamic binding.
        */
    }
}
