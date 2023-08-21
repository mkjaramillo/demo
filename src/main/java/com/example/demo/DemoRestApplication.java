package com.example.demo;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 *
 */
@ApplicationPath("/data")
@ApplicationScoped
public class DemoRestApplication extends Application {
}
