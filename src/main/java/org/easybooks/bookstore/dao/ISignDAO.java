package org.easybooks.bookstore.dao;

import java.util.List;

public interface ISignDAO {
   public List getAllSign();
   public void updateSign(String id, String signText);
   public void deleteSign(String id);
   public void addSign(String title, String text);
}
