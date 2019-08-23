package myjava8;

import lombok.extern.log4j.Log4j2;
import myjava8.model.Member;
import myjava8.utils.HibernateUtils;
import org.hibernate.Session;

/**
 * @ClassName HibernateTest
 * @Description TODO
 * @Author Chris Chen
 * @Date 2019-06-19 10:41
 * @Version 1.0
 **/
@Log4j2
public class HibernateTest{
    public static void main(String[] args) {
        final HibernateTest hibernateTest = new HibernateTest();
        hibernateTest.testSave();
    }
    /*
     * 增加User
     */
    public void testSave() {
        log.info("hello");
        Session session = null;
        try {
            session = HibernateUtils.getSession();
            session.beginTransaction();

            Member member = new Member();
            member.setId(25);
            member.setName("二五");
            member.setSex("F");
            session.save(member);
            session.getTransaction().commit();
        }catch(Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            HibernateUtils.closeSession(session);
        }
    }
    /**
     * 删除
     */
//    public void testDel(){
//        Session session = null;
//        try {
//            session = HibernateUtils.getSession();
//            session.beginTransaction();
//
//            User user=(User)session.load(User.class, "4028989545a244640145a24466300001");
//
//            session.delete(user);
//            session.getTransaction().commit();
//        }catch(Exception e) {
//            e.printStackTrace();
//            session.getTransaction().rollback();
//        }finally {
//            HibernateUtils.closeSession(session);
//        }
//    }

    /**
     * 修改
     */
//    public void testUpdate(){
//        Session session = null;
//        try {
//            session = HibernateUtils.getSession();
//            session.beginTransaction();
//
//            User user=(User)session.load(User.class, "4028989545a243ca0145a243cbf80001");
//            user.setName("王五");
//            session.update(user);
//            session.getTransaction().commit();
//        }catch(Exception e) {
//            e.printStackTrace();
//            session.getTransaction().rollback();
//        }finally {
//            HibernateUtils.closeSession(session);
//        }
//    }

    /**
     * 查询
     */
//    public void testLoad(){
//        Session session = null;
//        try {
//            session = HibernateUtils.getSession();
//            session.beginTransaction();
//
//            User user=(User)session.load(User.class, "4028989545a243ca0145a243cbf80001");
//            System.out.println(user.getName());
//            System.out.println(user.getId());
//            System.out.println(user.getPassword());
//            System.out.println(user.getClass());
//            System.out.println(user.getCreateTime());
//            System.out.println(user.getExpireTime());
//            session.getTransaction().commit();
//        }catch(Exception e) {
//            e.printStackTrace();
//            session.getTransaction().rollback();
//        }finally {
//            HibernateUtils.closeSession(session);
//        }
//    }
}
