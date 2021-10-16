/*
这个函数接受两个字符串 s1,s2。这些字符串只能由小写字母组成，并且具有相同的长度。这个函数的输出是另一个长度与 s1,s2 相同的字符串 g。g 的第 i 个字符等于 s1 的第i 个字符和 s2 的第 i 个字符的最小值，简单来说，g[i]=min(s1[i],s2[i])。

例如：f("ab","ba")= "aa", f("nzwzl","zizez")="niwel".

她现在有两个相同长度的只有小写字母的字符串 x,y。找出任何一个满足 f(x,z)=y 的

字符串 z。如果找不到这样的字符串的话，请输出-1。
*/
#include<stdio.h>
char *umi(char s1[],char s2[],int n);
int main()
{
    char *y;
    char p[10],q[10];
    int i;
    scanf("%d",&i);
    scanf("%s",p);
    scanf("%s",q);
    y=umi(p,q,i);
    printf("%s",y);
    return 0;


return 0;
}
char * umi(char s1[],char s2[],int n){
    static char a[10];
    int i;
    for(i=0;i<n;i++){
        if(s1[i]<s2[i]){
            a[i]=s1[i];
        }else {
            a[i]=s2[i];
        }
    }
    return a;

}