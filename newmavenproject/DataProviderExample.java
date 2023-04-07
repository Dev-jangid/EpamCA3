public class DataProviderExample {
    public Object[][] getloginData(){
        Object[][] login={{123456,"Harsh"},{"123","Piyush"}};
        return data;


    }
    @test(dataProvider= "mylogindata")
    public void loginForm(int reg, String name ){
        System.out.println(reg + " " + name);
    }

}
