import java.time.ZonedDateTime;

/**
 * @auther zzyy
 * @create 2020-02-21 15:50
 */
public class T2
{
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

       //2020-07-24T10:43:00.086+08:00[Asia/Shanghai]
    }
}
