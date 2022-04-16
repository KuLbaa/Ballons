package ProjektGUI;

public enum Colors {
	red(1), blue(2), green(3), orange(4), purple(5), black(6), yellow(7), grey(8), pink(9), brown(10), lime(11), magenta(12), cyan(13), bronze(14), canary(15), lapis(16);

	public final int state;

Colors(int state)
{
	this.state = state;
}
public int getState() 
{
	return state;
}
}
