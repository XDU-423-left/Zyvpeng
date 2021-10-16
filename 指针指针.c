#include<stdio.h>
#include<string.h>
#include<stdlib.h>

#if(1)
int main()
{
    char *name[3]={"abc","def","ghi"};
    char **p;                   //定义一个用来存储指针地址的值
    char *c="abc";
    printf("%p\n",name);//name保存的是name[0]的地址
    printf("%p\n",&name[0]);
    printf("%p\n",name[0]); // name[0]保存的是abc的地址  “abc”可以理解成取abc的地址
     printf("%p\n",*name);   //对name解引用就是对 name[0]这个地址解引用，得到的name[0]保存的就是abc的地址
     printf("%p",c);    
   //  p=name+1;            将name[1]的地址赋给p
   // printf("%s\n",*p);        对p解引用得到name[1],而name[1],而name[1]就是abc的地址，而要想输出字符串，只需要给出地址即可，所以*p实际上是一个地址
    return 0;

}
#endif


#if(0)
 int main(){
    char *name[]={"abc","def","ghi"};
    char *p;
     p=*(name+1);
    printf("%s",p);
    return 0;
 }
 #endif