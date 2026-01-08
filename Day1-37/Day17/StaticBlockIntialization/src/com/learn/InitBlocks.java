package com.learn;



public class InitBlocks {

    // SIB
    static {
        // SIB. it will be called once just after loading the class and before main()
        System.out.println("InitBlocks.SIB.. it will be called once just after\r\n"
                + "        // loading the class and before main(). You may create connection , file opening etc activities");
    }

    // IIB
    {
        System.out.println(" inside IIB....");
    }

    InitBlocks() {
        // 1st line super();
        // 2nd line call to init block
        // 3rd line onward.. you custom logic / code
        System.out.println("InitBlocks inside constructor");
    }

   public static void main(String[] args) {
        System.out.println("InitBlocks.main()");

        InitBlocks ib1 = new InitBlocks();
        InitBlocks ib2 = new InitBlocks();
        InitBlocks ib3 = new InitBlocks();
    }
}
