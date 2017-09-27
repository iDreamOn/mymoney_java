package com.idreamon.mymoney.web.Spending;

import lombok.Data;

import java.util.ArrayList;

import javax.validation.Valid;

@Data
public class SpendingListViewModel {

	@Valid
	private ArrayList<SpendingModel> todoList = new ArrayList<SpendingModel>();
	
	public SpendingListViewModel() {}
	
	public SpendingListViewModel(ArrayList<SpendingModel> todoList) {
		this.todoList = todoList;
	}
}