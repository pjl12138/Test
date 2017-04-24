import com.google.gson.Gson;

/**
 * Created by Administrator on 2017/4/24.
 */
public class Text {
    public static void main(String[] args){
        String jsonData="{'name':'wang','age':22,'grade':{'course':'Android','score':88}}";
        Gson gson=new Gson();
        Student student=gson.fromJson(jsonData,Student.class);
        System.out.println(student);
    }
}
