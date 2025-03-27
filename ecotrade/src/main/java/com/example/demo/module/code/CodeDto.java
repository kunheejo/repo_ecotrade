package com.example.demo.module.code;

import java.util.ArrayList;
import java.util.List;

public class CodeDto {

	private String cdseq;
	private String cgseq;
	 
	private Integer codeGroup_cgseq;
	private String cdAnotherseq;
	private String cdName;
	private String cgName;
	private String cdNameEng;
	private Integer cdUseNy;
	private Integer cdNum;
	private String cdExplanation;
	private Integer cdDelNy;
//	for cache
	public static List<CodeDto> cachedCodeArrayList = new ArrayList<CodeDto>();
	
	//==============
	public String getCdseq() {
		return cdseq;
	}
	public void setCdseq(String cdseq) {
		this.cdseq = cdseq;
	}
	public String getCgseq() {
		return cgseq;
	}
	public void setCgseq(String cgseq) {
		this.cgseq = cgseq;
	}
	public Integer getCodeGroup_cgseq() {
		return codeGroup_cgseq;
	}
	public void setCodeGroup_cgseq(Integer codeGroup_cgseq) {
		this.codeGroup_cgseq = codeGroup_cgseq;
	}
	public String getCdAnotherseq() {
		return cdAnotherseq;
	}
	public void setCdAnotherseq(String cdAnotherseq) {
		this.cdAnotherseq = cdAnotherseq;
	}
	public String getCdName() {
		return cdName;
	}
	public void setCdName(String cdName) {
		this.cdName = cdName;
	}
	public String getCgName() {
		return cgName;
	}
	public void setCgName(String cgName) {
		this.cgName = cgName;
	}
	public String getCdNameEng() {
		return cdNameEng;
	}
	public void setCdNameEng(String cdNameEng) {
		this.cdNameEng = cdNameEng;
	}
	public Integer getCdUseNy() {
		return cdUseNy;
	}
	public void setCdUseNy(Integer cdUseNy) {
		this.cdUseNy = cdUseNy;
	}
	public Integer getCdNum() {
		return cdNum;
	}
	public void setCdNum(Integer cdNum) {
		this.cdNum = cdNum;
	}
	public String getCdExplanation() {
		return cdExplanation;
	}
	public void setCdExplanation(String cdExplanation) {
		this.cdExplanation = cdExplanation;
	}
	public Integer getCdDelNy() {
		return cdDelNy;
	}
	public void setCdDelNy(Integer cdDelNy) {
		this.cdDelNy = cdDelNy;
	}
	
	 
	
	
}
