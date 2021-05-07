/*
LCD12864R
*/
#include <Arduino.h>
#ifndef LCD12864R_h
#define LCD12864R_h
#include <avr/pgmspace.h>
#include <inttypes.h>


class LCD12864R {
typedef unsigned char uchar;


public:

LCD12864R();

void Initialise(void);
void setPins(uint8_t tRS, uint8_t tRW, uint8_t tD7, uint8_t tD6, uint8_t tD5, uint8_t tD4, uint8_t tD3, uint8_t tD2, uint8_t tD1, uint8_t tD0);
void delayns(void);
void VectorConverter(int vector);

void WriteCommand(int CMD);
void WriteData(int CMD);


void CLEAR(void);
void DisplayString(int X,int Y,uchar *ptr,int dat);
void DisplaySig(int M,int N,int sig);
void DrawFullScreen(uchar *p);


int ScreenBuffer[16][32];

int delaytime;
int DEFAULTTIME;


static const int RS = 2; 
static const int RW = 3;  
static const int EN = 4;  
static const int D0  = 6;  
static const int D1  = 7; 
static const int D2  = 8;  
static const int D3  = 9;  
static const int D4  = 10; 
static const int D5  = 11;  
static const int D6  = 12;  
static const int D7  = 13; 


int temp[8];


};
extern LCD12864R LCDA;    
#endif
