#include<stdio.h>
#include<graphics.h>
#include<conio.h>

void main() {
    int gd = DETECT, gm;
    initgraph(&gd, &gm, "C:\\TC\\BGI");
    putpixel(50, 60, BLUE);
    putpixel(90, 80, BLACK);
    getch();
}