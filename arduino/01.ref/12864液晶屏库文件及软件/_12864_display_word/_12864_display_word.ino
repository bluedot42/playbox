#include <LCD12864RSPI.h>
#define AR_SIZE( a ) sizeof( a ) / sizeof( a[0] )    
unsigned char show0[]={0xB0,0xC2,0xCB,0xC9,0xBB,0xFA,0xC6,0xF7,0xC8,0xCB};//奥松机器人
unsigned char show1[]="www.alsrobot.cn";
 void setup()
    {
    LCDA.Initialise(); // 屏幕初始化
    delay(100);
    }    
void loop()
    {
    LCDA.CLEAR();//清屏
    delay(100);
    LCDA.DisplayString(0,0,show0,AR_SIZE(show0));//第1行第1格开始，显示文字
    LCDA.DisplayString(1,0,show1,AR_SIZE(show1));//第2行第1格开始，显示文字
    delay(5000);
    LCDA.CLEAR();//清屏
    }
