package dao;

import bll.FoodMenu;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;

public interface FoodDao extends Remote {
    ResultSet showMenu() throws RemoteException;
    void addMenu(FoodMenu fm) throws RemoteException;
    ResultSet getFoodByName(String foodName) throws RemoteException;
}
