#include <LCD12864RSPI.h> 
unsigned char showx[]="Light Sensor=";
int val = 0;
void setup()
{
  LCDA.Initialise(); // 屏幕初始化
}
 
void loop()
{
  double tempx=0;
  char strx[6];
  val = analogRead(A1);
  
  LCDA.CLEAR(); 
  
  LCDA.DisplayString(0,0,showx,13);
  dtostrf(val,6,2,strx);
  LCDA.DisplayString(1,0,(unsigned char *)strx,7);  
  
  delay(300);
}
