package PaquetesExtra;

import javax.swing.JButton;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseListener;

public class JButtonP extends JButton implements MouseEvent, MouseListener
{
	private Color colorHover = new Color(153,0,0);
	private Color colorNormal = new Color(255,0,0);
	private Color colorPressed = new Color(255,0,0);

	private Color colorTextHover = new Color(255,255,255);
	private Color colorTextNormal = new Color(255,255,255);
	private Color colorTextPressed = new Color(255,0,0);
	private boolean IsBase = false;
	
	public JButtonP()
	{
		this.setBorder(null);
		this.setContentAreaFilled(false);
		this.setOpaque(true);
		this.setFont(new Font("Tahoma",Font.BOLD,14));
		this.setBackground(Color.red);
		this.setForeground(Color.white);
		this.setPreferredSize(new Dimension(200,40));
		this.setSize(200,400);
		this.setCursor(new Cursor(12));
		
		addMouseListener(this);
	}
	public JButtonP(String text)
	{
		this.setBorder(null);
		this.setContentAreaFilled(false);
		this.setOpaque(true);
		this.setFont(new Font("Tahoma",Font.BOLD,14));
		this.setBackground(Color.red);
		this.setForeground(Color.white);
		this.setPreferredSize(new Dimension(200,40));
		this.setSize(200,400);
		this.setCursor(new Cursor(12));
		this.setText(text);
		addMouseListener(this);
	}

	@Override
	public int getDetail() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AbstractView getView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initUIEvent(String arg0, boolean arg1, boolean arg2, AbstractView arg3, int arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getBubbles() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getCancelable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EventTarget getCurrentTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public short getEventPhase() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EventTarget getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getTimeStamp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initEvent(String arg0, boolean arg1, boolean arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preventDefault() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopPropagation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getAltKey() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public short getButton() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getClientX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getClientY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getCtrlKey() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getMetaKey() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EventTarget getRelatedTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getScreenX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getScreenY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getShiftKey() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void initMouseEvent(String arg0, boolean arg1, boolean arg2, AbstractView arg3, int arg4, int arg5, int arg6,
			int arg7, int arg8, boolean arg9, boolean arg10, boolean arg11, boolean arg12, short arg13,
			EventTarget arg14) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(this.colorHover);
		this.setForeground(this.colorTextHover);
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(this.colorNormal);
		this.setForeground(this.colorTextNormal);
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		this.colorPressed = colorHover;
		this.setForeground(colorTextPressed);
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public Color getColorHover()
	{
		return colorHover;
	}
	public void setColorHover(Color colorHover)
	{
		this.colorHover = colorHover;
	}
	public Color getColorNormal()
	{
		return colorHover;
	}
	public void setColorNormal(Color colorNormal)
	{
		this.colorNormal = colorNormal;
		this.setBackground(this.colorNormal);
	}
	public Color getColorTextHover()
	{
		return colorTextHover;
	}
	public void setColorTextHover(Color colorTextHover)
	{
		this.colorHover = colorTextHover;
	}
	public Color getColorTextNormal()
	{
		return colorTextNormal;
	}
	public void setColorTextNormal(Color colorTextNormal)
	{
		this.colorTextNormal = colorTextNormal;
		this.setForeground(colorTextNormal);
	}
	public Color getColorPressed()
	{
		return colorPressed;
	}
	public void setColorPressed(Color colorPressed)
	{
		this.colorPressed = colorPressed;
		this.setForeground(colorPressed);
	}
	public Color getColorTextPressed()
	{
		return colorTextPressed;
	}
	public void setColorTextPressed(Color colorTextPressed)
	{
		this.colorTextPressed = colorTextPressed;
		this.setForeground(colorTextPressed);
	}
	public boolean getIsBase()
	{
		return IsBase;
	}
	public void setIsBase(boolean EsBase)
	{
		this.IsBase = EsBase;
		if(EsBase)
		{
			this.setColorNormal(Color.blue);
		}else
		{
			this.setColorNormal(Color.red);
		}
	}
}
