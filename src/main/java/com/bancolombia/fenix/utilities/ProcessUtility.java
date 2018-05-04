package com.bancolombia.fenix.utilities;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class ProcessUtility 
{ 
// command used to get list of running task
private static final String listaDeTareas = "tasklist"; 
// command used to kill a task
private static final String asesinoDeTareas = "taskkill /IM "; 
public static boolean isProcessRunning(String serviceName) { 
try { 
       Process pro = Runtime.getRuntime().exec(listaDeTareas); 
       BufferedReader reader = new BufferedReader(new InputStreamReader(pro.getInputStream())); 
       String line; 
	   while ((line = reader.readLine()) != null) { 
	   // System.out.println(line);
	   if (line.startsWith(serviceName)) { 
	   return true;
	   } 
       } 
       } catch (IOException e) { 
	   e.printStackTrace(); 
	   } 
	   return false; 
} 
public static void killProcess(String serviceName) { 
try { 
        Runtime.getRuntime().exec(asesinoDeTareas + serviceName); 
		System.out.println(serviceName+" killed successfully!"); 
		} catch (IOException e) { 
		e.printStackTrace();  
		}
	} 

}
