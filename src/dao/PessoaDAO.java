package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import connection.HibernateConnection;
import model.Pessoa;


public class PessoaDAO {
 private Session session;

 public void Salvar(Pessoa p){
  //obtem uma sessao
  session = HibernateConnection.getInstance();
  Transaction tx = null; //permite transacao com o BD 

  try{
   tx = session.beginTransaction();
   session.save(p);
   tx.commit();//faz a transacao
  }catch (Exception e) {
   e.printStackTrace();
   //cancela a transcao em caso de falha
   tx.rollback();
  }finally{
   session.close();
  }}}