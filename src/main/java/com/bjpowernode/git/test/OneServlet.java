package com.bjpowernode.git.test;

import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;

import java.net.HttpRetryException;

/**
 *
 */
public class OneServlet {
    public void doget(HttpRequest request, HttpResponse response){

        System.out.println("doget 方法");
    }
}
