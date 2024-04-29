package esfilemanager.common.data.record;

public class Subrecord
{
	protected String subrecordType;

	protected byte subrecordData[];

	public Subrecord()
	{
		
	}
	
	public Subrecord(String subrecordType, byte subrecordData[])
	{
		// memory saving mechanism  https://www.baeldung.com/java-string-pool
		this.subrecordType = subrecordType.intern();
		this.subrecordData = subrecordData;
	}

	public String getSubrecordType()
	{
		return subrecordType;
	}

	public byte[] getSubrecordData()
	{
		return subrecordData;
	}

	public void setSubrecordData(byte subrecordData[])
	{
		this.subrecordData = subrecordData;
	}

	@Override
	public String toString()
	{
		return subrecordType + " subrecord";
	}
}
