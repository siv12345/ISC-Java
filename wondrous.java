{\rtf1\ansi\ansicpg1252\cocoartf1348\cocoasubrtf170
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 import java.io.*;\
class shomes\
\{\
    public static void main (String args[]) throws IOException\
    \{\
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));\
        int sum1=0,c=0;\
        System.out.println("Enter n");\
        int n=Integer.parseInt(br.readLine());\
        if(n<2||n>10)\
            System.exit(0);\
        int sum=(n*((n*n)+1))/2;\
        int a[][]=new int[n][n];\
        System.out.println("Enter element");\
        for(int i=0;i<n;i++)\{\
            for(int j=0;j<n;j++)\{\
                int m=Integer.parseInt(br.readLine());\
                if(m>=1&&m<=(n*n))\{\
                    a[i][j]=m;\
                    sum1+=m;\}\
                else\
                    System.exit(1);\
            \}\
            if(sum1!=sum)\
                System.exit(1);\
            sum1=0;\
        \}\
        for(int i=0;i<n;i++)\{\
            for(int j=0;j<n;j++)\{\
                for(int k=0;k<n;k++)\{\
                    if(a[i][j]==a[i][k])\
                        c++;\
                \}\
                if(c!=1)\
                System.exit(1);\
                c=0;\
            \}\
        \}\
        System.out.println("This is a wonderous matrix.Kudos Siva and Shomes");\
    \}\
\}\
            }