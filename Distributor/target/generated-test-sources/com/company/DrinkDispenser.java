// Generated by GraphWalker (http://www.graphwalker.org)
package com.company;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model (file ="com/company/DrinkDispenser.json")
public interface DrinkDispenser {

    @Vertex()
    void v_wait();

    @Edge()
    void e_deliver();

    @Edge()
    void e_reset();

    @Vertex()
    void v_collect_money();

    @Vertex()
    void v_giveback_money();

    @Edge()
    void e_giveback_money();

    @Vertex()
    void v_test_choice();

    @Vertex()
    void v_deliver();

    @Edge()
    void e_unselect_item();

    @Edge()
    void e_select_item();

    @Edge()
    void e_insert_coins();
}
