// Generated by GraphWalker (http://www.graphwalker.org)
package org.graphwalker;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "org/graphwalker/ShoppingCart.json")
public interface ShoppingCart {

    @Edge()
    void e_ClickBook();

    @Edge()
    void e_AddBookToCart();

    @Vertex()
    void v_BookInformation();

    @Vertex()
    void v_OtherBoughtBooks();

    @Edge()
    void e_StartBrowser();

    @Vertex()
    void v_SearchResult();

    @Vertex()
    void v_ShoppingCart();

    @Edge()
    void e_EnterBaseURL();

    @Vertex()
    void v_BaseURL();

    @Vertex()
    void v_BrowserStarted();

    @Edge()
    void e_SearchBook();

    @Edge()
    void e_ShoppingCart();
}
