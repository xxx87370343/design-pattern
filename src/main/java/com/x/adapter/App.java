package com.x.adapter;

public class App {
    public static void main(String[] args) {
        new DataCollector(new XmlDataShower()).showData();
    }

//    public void getResource() {
//        InputStream is = this.getClass().getResourceAsStream("adapter-test.xml");  //拿不到资源
//        InputStream is1 = this.getClass().getResourceAsStream("/adapter-test.xml"); // 拿到资源
//        InputStream is2 = this.getClass().getClassLoader().getResourceAsStream("adapter-test.xml"); //拿到资源
//        System.out.println(is);
//        System.out.println(is1);
//        System.out.println(is2);
//    }
}
