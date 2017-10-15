//package com.java.service;
//
//import java.io.BufferedReader;
//
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import com.alibaba.fastjson.JSON;
//import com.java.po.TransformObj;
//
//class PersonNode{
//	public Integer id; //节点
//	public Integer index; //在一条传播链的位置
//	public Integer firstId; //在一条传播链的最初的位置
//	public PersonNode(Integer id, Integer index) {
//		super();
//		this.id = id;
//		this.index = index;
//	}
//	public PersonNode(Integer id, Integer index, Integer firstId) {
//		super();
//		this.id = id;
//		this.index = index;
//		this.firstId = firstId;
//	}
//}
//
//public class CopyOfTransformTree {
//	
//	public static void main(String[] args) {
//		
//			String text = readTftxt();
//			Map<String,Integer>  headMap = new HashMap<String,Integer> ();
//			int headNum = 1;
//			String[] line = text.split("\n");
//			for(int i = 0; i < line.length; i++){
//				String[] Name = line[i].split("~");
//				String firstName = Name[0];
//				if (!headMap.containsKey(firstName)){
//					headMap.put(firstName,headNum);
//					headNum ++;
//				}
//			}
//			
//			System.out.println("headMap: "+headMap.size());
//			
//			Map<String,Integer>  notHeadNameMap = new HashMap<String,Integer> ();
//			int notHeadNameNum = 1+ headMap.size();
//			for(int i = 0; i < line.length; i++){
//				String[] Name = line[i].split("~");
//				for (int j = 1; j < Name.length; j++){
//					if (!notHeadNameMap.containsKey(Name[j])){
//						notHeadNameMap.put(Name[j],notHeadNameNum);
//						notHeadNameNum ++;
//					}
//				}
//			}
//			
////			System.out.println("notHeadNameMap1: "+notHeadNameMap.size());
////			notHeadNameMap.putAll(headMap);
////			System.out.println("notHeadNameMap2: "+notHeadNameMap.size());
//
//			
//			List<TransformObj> userList = new ArrayList<TransformObj>();
//			for(int i = 0; i < line.length; i++){
//				String[] nameList = line[i].split("~");
//				TransformObj tobj1 = new TransformObj(nameList[1],notHeadNameMap.get(nameList[1]),headMap.get(nameList[0]));
//				userList.add(tobj1);
//				
//				for (int j = 2; i < nameList.length; i++){
//					TransformObj tobj2 = new TransformObj(nameList[j],notHeadNameMap.get(nameList[j]),notHeadNameMap.get(nameList[j-1]));
//					userList.add(tobj2);
//				}
//			}
//			System.out.println(JSON.toJSON(userList));
//			
//			Set<String> headkeySet = headMap.keySet();
//			for (String head : headkeySet){
//				TransformObj tobj = new TransformObj(head,headMap.get(head),0);
//				userList.add(tobj);
//			}
//			
//		
//		//生成树状图
//        Map<Integer,TreeTest> map = new HashMap<Integer,TreeTest>();
//		for (TransformObj userobj : userList){
//	        TreeTest terr = new TreeTest(userobj.getId(),userobj.getpId(),userobj.getName());
//	        map.put(terr.getId(), terr);
//		}
//        List<TreeTest> li = TreeTest. getChildren(map,0,1);
//        
//        Map<String,Object> resultMap = new HashMap<String,Object>();
//        resultMap.put("name", "裸贷");
//        resultMap.put("children", li);
//        resultMap.put("id", -1);
//        resultMap.put("pId", 0);
//        
//        System.out.println(JSON.toJSON(resultMap));
//		
//	}
//
//	private static String readTftxt() {
//		FileReader fr = null;
//		BufferedReader br = null;
//		StringBuffer sb = new StringBuffer();
//		
//		try {
//			File f = new File("./Documents/result/transform/裸贷.txt");
//			fr = new FileReader(f);
//			br = new BufferedReader(fr);
//			String str;
//			while ((str = br.readLine()) != null) {
////				System.out.println(str);
//				sb.append(str);
//				sb.append("\n");
//
//				
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if (br != null) {
//				try {
//					br.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			if (fr != null) {
//				try {
//					fr.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		System.out.println(sb.toString());
//		return sb.toString();
//	}
//	
//
//
//}
