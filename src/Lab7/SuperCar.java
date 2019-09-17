package Lab7;
//สอบ final ไม่จำเป็นต้องพิมใช้ทางลัดได้เลย
public class SuperCar {

    private String carBrand;
    private String carColor;
    private int carEngineSize;
    private String maxSpeed; //ความเร็ว
    private String countryOfOrigin; //มาจากประเทศไหน

    public SuperCar(){}
    //constructor ไม่ทำอะไรใช้ในการสร้างobject เฉยๆ
    public  SuperCar(String carBrand,String carColor,int carEngineSize,String maxSpeed,String countryOfOrigin){
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carEngineSize = carEngineSize;
        this.maxSpeed = maxSpeed;
        this.countryOfOrigin = countryOfOrigin;
    }

//getter,setter
    public  String getCarBrand(){
        return this.carBrand;
    }
    public  void setCarBrand(String newCarBrand){
        this.carBrand = newCarBrand;
    }

    //
    public String getCarColor(){
        return this.carColor;
    }
    public  void setCarColor(String newCarColor){
        this.carColor = newCarColor;
    }

    //
    public int getCarEngineSize(){
        return this.carEngineSize;
    }
    public void setCarEngineSize(int newcarEngineSize){
        this.carEngineSize = newcarEngineSize;
    }

    //
    public String getMaxSpeed(){
        return this.maxSpeed;
    }
    public void setMaxSpeed(String newmaxSpeed){
        this.maxSpeed = newmaxSpeed;
    }

    //
    public String getCountryOfOrigin(){
        return this.countryOfOrigin;
    }
    public void setCountryOfOrigin(String newCountryOfOrigin){
        this.countryOfOrigin = newCountryOfOrigin;
    }


    public  void getSuperinfo(){
        System.out.println(carBrand+carColor+carEngineSize+maxSpeed+countryOfOrigin);
    }







}//class
