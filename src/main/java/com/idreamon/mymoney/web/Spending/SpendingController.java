package com.idreamon.mymoney.web.Spending;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;

@Controller
public class SpendingController {

    @Autowired
    private SpendingRepository repository;

    @RequestMapping("/")
    public String index(Model model) {
        ArrayList<SpendingModel> todoList = (ArrayList<SpendingModel>) repository.findAll();
        //model.addAttribute("items", todoList);
        model.addAttribute("newitem", new SpendingModel());
        model.addAttribute("items", new SpendingListViewModel(todoList));
        return "index";
    }

    @RequestMapping("/add")
    public String addTodo(@ModelAttribute SpendingModel requestItem) {
        SpendingModel item = new SpendingModel(requestItem.getCategory(), requestItem.getName());
        repository.save(item);
        return "redirect:/";
    }

    @RequestMapping("/update")
    public String updateTodo(@ModelAttribute SpendingListViewModel requestItems) {
        for (SpendingModel requestItem : requestItems.getTodoList() ) {
             SpendingModel item = new SpendingModel(requestItem.getCategory(), requestItem.getName());
             item.setComplete(requestItem.isComplete());
             item.setId(requestItem.getId());
             repository.save(item);
        }
        return "redirect:/";
    }
}
