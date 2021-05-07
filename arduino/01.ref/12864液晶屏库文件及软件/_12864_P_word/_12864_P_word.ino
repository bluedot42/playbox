#include "LCD12864R.h"
#define AR_SIZE( a ) sizeof( a ) / sizeof( a[0] )
unsigned char show0[]={
  0xB9, 0xFE,
  0xB6, 0xFB,
  0xB1, 0xF5,
  0xB0, 0xC2,
  0xCB, 0xC9,
  0xBB, 0xFA,
  0xC6, 0xF7,
  0xC8, 0xCB
};                    //哈尔滨奥松机器人
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
LCDA.DisplayString(0,0,show0,AR_SIZE(show0));//第一行第三格开始，显示文智位机器人
delay(100);
LCDA.DisplayString(2,0,show1,AR_SIZE(show1));;//第三行第二格开始，显示网址dfrobot.com/
delay(5000);
}
