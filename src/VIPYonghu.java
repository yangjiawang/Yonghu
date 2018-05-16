/**
 * Created by YANGJIAWANG on 2018/5/16.
 */
public class VIPYonghu extends Yonghu {

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setJibie(int jibie) {
        super.setJibie(jibie);
    }

    @Override
    public String getName() {
        return super.getName();
    }

   public void Tousu(){
        System.out.println(name+"先生/女士正在投诉----------------------");
   }
public  void XX(){
       System.out.println(name+"先生/女士正在投诉"+"\t"+"您的级别是"+jibie+"级");
}
}
