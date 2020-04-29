package model;

import java.util.Date;

public class SensorEvent {
	private String user_name;
	private String proc_sha2;
	private String proc_path;
	private String proc_md5;
	private String proc_cmd;
	private int proc_attr;
	private int pid;
	private String nw_domain_name;
	private int nw_response;
	public String getNw_domain_name() {
		return nw_domain_name;
	}

	public void setNw_domain_name(String nw_domain_name) {
		this.nw_domain_name = nw_domain_name;
	}

	private Date nw_start_time;
	private int nw_method;
	private String nw_url;
	private String pdb_path;
	private String nw_dns_ips;
	private String parent_guid;
	private String parent_name;
	public int getNw_packet_count() {
		return nw_packet_count;
	}

	public void setNw_packet_count(int nw_packet_count) {
		this.nw_packet_count = nw_packet_count;
	}

	public int getNw_data_rec() {
		return nw_data_rec;
	}

	public void setNw_data_rec(int nw_data_rec) {
		this.nw_data_rec = nw_data_rec;
	}

	public int getNw_data_sent() {
		return nw_data_sent;
	}

	public void setNw_data_sent(int nw_data_sent) {
		this.nw_data_sent = nw_data_sent;
	}

	public Date getNw_end_time() {
		return nw_end_time;
	}

	public void setNw_end_time(Date nw_end_time) {
		this.nw_end_time = nw_end_time;
	}

	private int nw_packet_count;
	private int nw_data_rec;
	private int nw_data_sent;
	private Date nw_end_time;
	private int nw_conn_type;
	private String bin_ver_cpright;
	private String bin_ver_cmp;
	private long bin_size;
	public String getBin_ver_cpright() {
		return bin_ver_cpright;
	}

	public void setBin_ver_cpright(String bin_ver_cpright) {
		this.bin_ver_cpright = bin_ver_cpright;
	}

	public String getBin_ver_cmp() {
		return bin_ver_cmp;
	}

	public void setBin_ver_cmp(String bin_ver_cmp) {
		this.bin_ver_cmp = bin_ver_cmp;
	}

	public long getBin_size() {
		return bin_size;
	}

	public void setBin_size(long bin_size) {
		this.bin_size = bin_size;
	}

	public String getBin_prod_ver() {
		return bin_prod_ver;
	}

	public void setBin_prod_ver(String bin_prod_ver) {
		this.bin_prod_ver = bin_prod_ver;
	}

	public String getBin_prod_name() {
		return bin_prod_name;
	}

	public void setBin_prod_name(String bin_prod_name) {
		this.bin_prod_name = bin_prod_name;
	}

	public String getBin_orginal_file_name() {
		return bin_orginal_file_name;
	}

	public void setBin_orginal_file_name(String bin_orginal_file_name) {
		this.bin_orginal_file_name = bin_orginal_file_name;
	}

	public int getBin_is_signed() {
		return bin_is_signed;
	}

	public void setBin_is_signed(int bin_is_signed) {
		this.bin_is_signed = bin_is_signed;
	}

	public String getBin_internal_file_name() {
		return bin_internal_file_name;
	}

	public void setBin_internal_file_name(String bin_internal_file_name) {
		this.bin_internal_file_name = bin_internal_file_name;
	}

	public String getBin_digs_sid() {
		return bin_digs_sid;
	}

	public void setBin_digs_sid(String bin_digs_sid) {
		this.bin_digs_sid = bin_digs_sid;
	}

	public String getBin_digs_pub() {
		return bin_digs_pub;
	}

	public void setBin_digs_pub(String bin_digs_pub) {
		this.bin_digs_pub = bin_digs_pub;
	}

	public String getBin_digs_issuer() {
		return bin_digs_issuer;
	}

	public void setBin_digs_issuer(String bin_digs_issuer) {
		this.bin_digs_issuer = bin_digs_issuer;
	}

	private String bin_prod_ver;
	private String bin_prod_name;
	private String bin_orginal_file_name;
	private int bin_is_signed;
	private String bin_internal_file_name;
	private String bin_digs_sid;
	private String bin_digs_pub;
	private String bin_digs_issuer;
	private Date act_timestamp;// ":1587555087317,
	private int action; // ":20,
	private String aid; // "119e32e7a87945c9b424a860553732d3",
	private int child_attr;
	private String child_cmd_line;
	private String child_guid;
	private String child_md5;
	private String child_name;
	private String child_path;
	private int child_pid;
	private String child_sha2;
	private Date child_start_time;
	private int drive_type;
	private int event_cat_id; // ":4,
	private int event_id; // ":8,
	private Date event_timestamp; // ":1587555106224,
	private String group; // ":"",
	private String host_name; // ":"WIN7PROX64-001",
	private String host_type; // ":"DESKTOP",
	private String mid; // "77046bc1f768cff29c0b0aaae0bcb667",
	private int nw_direction; // ":1,
	private long nw_flow_no; // ":198048,
	private String nw_local_ip; // ":"ff02:0000:0000:0000:0000:0000:0000:000c",
	private long nw_local_port; // ":1900,
	private int nw_packect_no; // ":0,
	private int nw_protocol; // ":2,
	private String nw_remote_ip; // ":"fe80:0000:0000:0000:8c9c:497d:0a38:f138",
	private long nw_remote_port; // ":57018,
	private long nw_seq_no; // ":2352402,
	private int nw_socket_type; // ":6,
	private String os; // ":"Windows 7 64 bit",
	private String proc_guid; // ":"b89f99fe52ce11eaa2a6005056a1fec3",
	private String proc_name; // ":"svchost.exe",
	private int sequenceid; // ":0,
	private long sessionid; // ":176414,
	private String tid; // ":"tp7wnq"

	public int getChild_attr() {
		return child_attr;
	}

	public void setChild_attr(int child_attr) {
		this.child_attr = child_attr;
	}

	public String getChild_cmd_line() {
		return child_cmd_line;
	}

	public void setChild_cmd_line(String child_cmd_line) {
		this.child_cmd_line = child_cmd_line;
	}

	public String getChild_guid() {
		return child_guid;
	}

	public void setChild_guid(String child_guid) {
		this.child_guid = child_guid;
	}

	public String getChild_md5() {
		return child_md5;
	}

	public void setChild_md5(String child_md5) {
		this.child_md5 = child_md5;
	}

	public String getChild_name() {
		return child_name;
	}

	public void setChild_name(String child_name) {
		this.child_name = child_name;
	}

	public String getChild_path() {
		return child_path;
	}

	public void setChild_path(String child_path) {
		this.child_path = child_path;
	}

	public int getChild_pid() {
		return child_pid;
	}

	public void setChild_pid(int child_pid) {
		this.child_pid = child_pid;
	}

	public String getChild_sha2() {
		return child_sha2;
	}

	public void setChild_sha2(String child_sha2) {
		this.child_sha2 = child_sha2;
	}

	public Date getChild_start_time() {
		return child_start_time;
	}

	public void setChild_start_time(Date child_start_time) {
		this.child_start_time = child_start_time;
	}

	public int getDrive_type() {
		return drive_type;
	}

	public void setDrive_type(int drive_type) {
		this.drive_type = drive_type;
	}
	
	public Date getAct_timestamp() {
		return act_timestamp;
	}

	public void setAct_timestamp(Date act_timestamp) {
		this.act_timestamp = act_timestamp;
	}

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public int getEvent_cat_id() {
		return event_cat_id;
	}

	public void setEvent_cat_id(int event_cat_id) {
		this.event_cat_id = event_cat_id;
	}

	public int getEvent_id() {
		return event_id;
	}

	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}

	public Date getEvent_timestamp() {
		return event_timestamp;
	}

	public void setEvent_timestamp(Date event_timestamp) {
		this.event_timestamp = event_timestamp;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getHost_name() {
		return host_name;
	}

	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}

	public String getHost_type() {
		return host_type;
	}

	public void setHost_type(String host_type) {
		this.host_type = host_type;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public int getNw_direction() {
		return nw_direction;
	}

	public void setNw_direction(int nw_direction) {
		this.nw_direction = nw_direction;
	}

	public long getNw_flow_no() {
		return nw_flow_no;
	}

	public void setNw_flow_no(long nw_flow_no) {
		this.nw_flow_no = nw_flow_no;
	}

	public String getNw_local_ip() {
		return nw_local_ip;
	}

	public void setNw_local_ip(String nw_local_ip) {
		this.nw_local_ip = nw_local_ip;
	}

	public long getNw_local_port() {
		return nw_local_port;
	}

	public void setNw_local_port(long nw_local_port) {
		this.nw_local_port = nw_local_port;
	}

	public int getNw_packect_no() {
		return nw_packect_no;
	}

	public void setNw_packect_no(int nw_packect_no) {
		this.nw_packect_no = nw_packect_no;
	}

	public int getNw_protocol() {
		return nw_protocol;
	}

	public void setNw_protocol(int nw_protocol) {
		this.nw_protocol = nw_protocol;
	}

	public String getNw_remote_ip() {
		return nw_remote_ip;
	}

	public void setNw_remote_ip(String nw_remote_ip) {
		this.nw_remote_ip = nw_remote_ip;
	}

	public long getNw_remote_port() {
		return nw_remote_port;
	}

	public void setNw_remote_port(long nw_remote_port) {
		this.nw_remote_port = nw_remote_port;
	}

	public long getNw_seq_no() {
		return nw_seq_no;
	}

	public void setNw_seq_no(long nw_seq_no) {
		this.nw_seq_no = nw_seq_no;
	}

	public int getNw_socket_type() {
		return nw_socket_type;
	}

	public void setNw_socket_type(int nw_socket_type) {
		this.nw_socket_type = nw_socket_type;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getProc_guid() {
		return proc_guid;
	}

	public void setProc_guid(String proc_guid) {
		this.proc_guid = proc_guid;
	}

	public String getProc_name() {
		return proc_name;
	}

	public void setProc_name(String proc_name) {
		this.proc_name = proc_name;
	}

	public int getSequenceid() {
		return sequenceid;
	}

	public void setSequenceid(int sequenceid) {
		this.sequenceid = sequenceid;
	}

	public long getSessionid() {
		return sessionid;
	}

	public void setSessionid(long sessionid) {
		this.sessionid = sessionid;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((act_timestamp == null) ? 0 : act_timestamp.hashCode());
		result = prime * result + action;
		result = prime * result + ((aid == null) ? 0 : aid.hashCode());
		result = prime * result + ((bin_digs_issuer == null) ? 0 : bin_digs_issuer.hashCode());
		result = prime * result + ((bin_digs_pub == null) ? 0 : bin_digs_pub.hashCode());
		result = prime * result + ((bin_digs_sid == null) ? 0 : bin_digs_sid.hashCode());
		result = prime * result + ((bin_internal_file_name == null) ? 0 : bin_internal_file_name.hashCode());
		result = prime * result + bin_is_signed;
		result = prime * result + ((bin_orginal_file_name == null) ? 0 : bin_orginal_file_name.hashCode());
		result = prime * result + ((bin_prod_name == null) ? 0 : bin_prod_name.hashCode());
		result = prime * result + ((bin_prod_ver == null) ? 0 : bin_prod_ver.hashCode());
		result = prime * result + (int) (bin_size ^ (bin_size >>> 32));
		result = prime * result + ((bin_ver_cmp == null) ? 0 : bin_ver_cmp.hashCode());
		result = prime * result + ((bin_ver_cpright == null) ? 0 : bin_ver_cpright.hashCode());
		result = prime * result + child_attr;
		result = prime * result + ((child_cmd_line == null) ? 0 : child_cmd_line.hashCode());
		result = prime * result + ((child_guid == null) ? 0 : child_guid.hashCode());
		result = prime * result + ((child_md5 == null) ? 0 : child_md5.hashCode());
		result = prime * result + ((child_name == null) ? 0 : child_name.hashCode());
		result = prime * result + ((child_path == null) ? 0 : child_path.hashCode());
		result = prime * result + child_pid;
		result = prime * result + ((child_sha2 == null) ? 0 : child_sha2.hashCode());
		result = prime * result + ((child_start_time == null) ? 0 : child_start_time.hashCode());
		result = prime * result + drive_type;
		result = prime * result + event_cat_id;
		result = prime * result + event_id;
		result = prime * result + ((event_timestamp == null) ? 0 : event_timestamp.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((host_name == null) ? 0 : host_name.hashCode());
		result = prime * result + ((host_type == null) ? 0 : host_type.hashCode());
		result = prime * result + ((mid == null) ? 0 : mid.hashCode());
		result = prime * result + nw_direction;
		result = prime * result + (int) (nw_flow_no ^ (nw_flow_no >>> 32));
		result = prime * result + ((nw_local_ip == null) ? 0 : nw_local_ip.hashCode());
		result = prime * result + (int) (nw_local_port ^ (nw_local_port >>> 32));
		result = prime * result + nw_packect_no;
		result = prime * result + nw_protocol;
		result = prime * result + ((nw_remote_ip == null) ? 0 : nw_remote_ip.hashCode());
		result = prime * result + (int) (nw_remote_port ^ (nw_remote_port >>> 32));
		result = prime * result + (int) (nw_seq_no ^ (nw_seq_no >>> 32));
		result = prime * result + nw_socket_type;
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		result = prime * result + ((proc_guid == null) ? 0 : proc_guid.hashCode());
		result = prime * result + ((proc_name == null) ? 0 : proc_name.hashCode());
		result = prime * result + sequenceid;
		result = prime * result + (int) (sessionid ^ (sessionid >>> 32));
		result = prime * result + ((tid == null) ? 0 : tid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SensorEvent other = (SensorEvent) obj;
		if (act_timestamp == null) {
			if (other.act_timestamp != null)
				return false;
		} else if (!act_timestamp.equals(other.act_timestamp))
			return false;
		if (action != other.action)
			return false;
		if (aid == null) {
			if (other.aid != null)
				return false;
		} else if (!aid.equals(other.aid))
			return false;
		if (bin_digs_issuer == null) {
			if (other.bin_digs_issuer != null)
				return false;
		} else if (!bin_digs_issuer.equals(other.bin_digs_issuer))
			return false;
		if (bin_digs_pub == null) {
			if (other.bin_digs_pub != null)
				return false;
		} else if (!bin_digs_pub.equals(other.bin_digs_pub))
			return false;
		if (bin_digs_sid == null) {
			if (other.bin_digs_sid != null)
				return false;
		} else if (!bin_digs_sid.equals(other.bin_digs_sid))
			return false;
		if (bin_internal_file_name == null) {
			if (other.bin_internal_file_name != null)
				return false;
		} else if (!bin_internal_file_name.equals(other.bin_internal_file_name))
			return false;
		if (bin_is_signed != other.bin_is_signed)
			return false;
		if (bin_orginal_file_name == null) {
			if (other.bin_orginal_file_name != null)
				return false;
		} else if (!bin_orginal_file_name.equals(other.bin_orginal_file_name))
			return false;
		if (bin_prod_name == null) {
			if (other.bin_prod_name != null)
				return false;
		} else if (!bin_prod_name.equals(other.bin_prod_name))
			return false;
		if (bin_prod_ver == null) {
			if (other.bin_prod_ver != null)
				return false;
		} else if (!bin_prod_ver.equals(other.bin_prod_ver))
			return false;
		if (bin_size != other.bin_size)
			return false;
		if (bin_ver_cmp == null) {
			if (other.bin_ver_cmp != null)
				return false;
		} else if (!bin_ver_cmp.equals(other.bin_ver_cmp))
			return false;
		if (bin_ver_cpright == null) {
			if (other.bin_ver_cpright != null)
				return false;
		} else if (!bin_ver_cpright.equals(other.bin_ver_cpright))
			return false;
		if (child_attr != other.child_attr)
			return false;
		if (child_cmd_line == null) {
			if (other.child_cmd_line != null)
				return false;
		} else if (!child_cmd_line.equals(other.child_cmd_line))
			return false;
		if (child_guid == null) {
			if (other.child_guid != null)
				return false;
		} else if (!child_guid.equals(other.child_guid))
			return false;
		if (child_md5 == null) {
			if (other.child_md5 != null)
				return false;
		} else if (!child_md5.equals(other.child_md5))
			return false;
		if (child_name == null) {
			if (other.child_name != null)
				return false;
		} else if (!child_name.equals(other.child_name))
			return false;
		if (child_path == null) {
			if (other.child_path != null)
				return false;
		} else if (!child_path.equals(other.child_path))
			return false;
		if (child_pid != other.child_pid)
			return false;
		if (child_sha2 == null) {
			if (other.child_sha2 != null)
				return false;
		} else if (!child_sha2.equals(other.child_sha2))
			return false;
		if (child_start_time == null) {
			if (other.child_start_time != null)
				return false;
		} else if (!child_start_time.equals(other.child_start_time))
			return false;
		if (drive_type != other.drive_type)
			return false;
		if (event_cat_id != other.event_cat_id)
			return false;
		if (event_id != other.event_id)
			return false;
		if (event_timestamp == null) {
			if (other.event_timestamp != null)
				return false;
		} else if (!event_timestamp.equals(other.event_timestamp))
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (host_name == null) {
			if (other.host_name != null)
				return false;
		} else if (!host_name.equals(other.host_name))
			return false;
		if (host_type == null) {
			if (other.host_type != null)
				return false;
		} else if (!host_type.equals(other.host_type))
			return false;
		if (mid == null) {
			if (other.mid != null)
				return false;
		} else if (!mid.equals(other.mid))
			return false;
		if (nw_direction != other.nw_direction)
			return false;
		if (nw_flow_no != other.nw_flow_no)
			return false;
		if (nw_local_ip == null) {
			if (other.nw_local_ip != null)
				return false;
		} else if (!nw_local_ip.equals(other.nw_local_ip))
			return false;
		if (nw_local_port != other.nw_local_port)
			return false;
		if (nw_packect_no != other.nw_packect_no)
			return false;
		if (nw_protocol != other.nw_protocol)
			return false;
		if (nw_remote_ip == null) {
			if (other.nw_remote_ip != null)
				return false;
		} else if (!nw_remote_ip.equals(other.nw_remote_ip))
			return false;
		if (nw_remote_port != other.nw_remote_port)
			return false;
		if (nw_seq_no != other.nw_seq_no)
			return false;
		if (nw_socket_type != other.nw_socket_type)
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		if (proc_guid == null) {
			if (other.proc_guid != null)
				return false;
		} else if (!proc_guid.equals(other.proc_guid))
			return false;
		if (proc_name == null) {
			if (other.proc_name != null)
				return false;
		} else if (!proc_name.equals(other.proc_name))
			return false;
		if (sequenceid != other.sequenceid)
			return false;
		if (sessionid != other.sessionid)
			return false;
		if (tid == null) {
			if (other.tid != null)
				return false;
		} else if (!tid.equals(other.tid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SensorEvent [bin_ver_cpright=").append(bin_ver_cpright).append(", bin_ver_cmp=")
				.append(bin_ver_cmp).append(", bin_size=").append(bin_size).append(", bin_prod_ver=")
				.append(bin_prod_ver).append(", bin_prod_name=").append(bin_prod_name)
				.append(", bin_orginal_file_name=").append(bin_orginal_file_name).append(", bin_is_signed=")
				.append(bin_is_signed).append(", bin_internal_file_name=").append(bin_internal_file_name)
				.append(", bin_digs_sid=").append(bin_digs_sid).append(", bin_digs_pub=").append(bin_digs_pub)
				.append(", bin_digs_issuer=").append(bin_digs_issuer).append(", act_timestamp=").append(act_timestamp)
				.append(", action=").append(action).append(", aid=").append(aid).append(", child_attr=")
				.append(child_attr).append(", child_cmd_line=").append(child_cmd_line).append(", child_guid=")
				.append(child_guid).append(", child_md5=").append(child_md5).append(", child_name=").append(child_name)
				.append(", child_path=").append(child_path).append(", child_pid=").append(child_pid)
				.append(", child_sha2=").append(child_sha2).append(", child_start_time=").append(child_start_time)
				.append(", drive_type=").append(drive_type).append(", event_cat_id=").append(event_cat_id)
				.append(", event_id=").append(event_id).append(", event_timestamp=").append(event_timestamp)
				.append(", group=").append(group).append(", host_name=").append(host_name).append(", host_type=")
				.append(host_type).append(", mid=").append(mid).append(", nw_direction=").append(nw_direction)
				.append(", nw_flow_no=").append(nw_flow_no).append(", nw_local_ip=").append(nw_local_ip)
				.append(", nw_local_port=").append(nw_local_port).append(", nw_packect_no=").append(nw_packect_no)
				.append(", nw_protocol=").append(nw_protocol).append(", nw_remote_ip=").append(nw_remote_ip)
				.append(", nw_remote_port=").append(nw_remote_port).append(", nw_seq_no=").append(nw_seq_no)
				.append(", nw_socket_type=").append(nw_socket_type).append(", os=").append(os).append(", proc_guid=")
				.append(proc_guid).append(", proc_name=").append(proc_name).append(", sequenceid=").append(sequenceid)
				.append(", sessionid=").append(sessionid).append(", tid=").append(tid).append("]");
		return builder.toString();
	}

	public int getNw_conn_type() {
		return nw_conn_type;
	}

	public void setNw_conn_type(int nw_conn_type) {
		this.nw_conn_type = nw_conn_type;
	}

	public Date getNw_start_time() {
		return nw_start_time;
	}

	public void setNw_start_time(Date nw_start_time) {
		this.nw_start_time = nw_start_time;
	}

	public int getNw_method() {
		return nw_method;
	}

	public void setNw_method(int nw_method) {
		this.nw_method = nw_method;
	}

	public String getNw_url() {
		return nw_url;
	}

	public void setNw_url(String nw_url) {
		this.nw_url = nw_url;
	}

	public String getPdb_path() {
		return pdb_path;
	}

	public void setPdb_path(String pdb_path) {
		this.pdb_path = pdb_path;
	}

	public String getNw_dns_ips() {
		return nw_dns_ips;
	}

	public void setNw_dns_ips(String nw_dns_ips) {
		this.nw_dns_ips = nw_dns_ips;
	}

	public String getParent_guid() {
		return parent_guid;
	}

	public void setParent_guid(String parent_guid) {
		this.parent_guid = parent_guid;
	}

	public String getParent_name() {
		return parent_name;
	}

	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}

	public int getNw_response() {
		return nw_response;
	}

	public void setNw_response(int nw_response) {
		this.nw_response = nw_response;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getProc_attr() {
		return proc_attr;
	}

	public void setProc_attr(int proc_attr) {
		this.proc_attr = proc_attr;
	}

	public String getProc_cmd() {
		return proc_cmd;
	}

	public void setProc_cmd(String proc_cmd) {
		this.proc_cmd = proc_cmd;
	}

	public String getProc_md5() {
		return proc_md5;
	}

	public void setProc_md5(String proc_md5) {
		this.proc_md5 = proc_md5;
	}

	public String getProc_path() {
		return proc_path;
	}

	public void setProc_path(String proc_path) {
		this.proc_path = proc_path;
	}

	public String getProc_sha2() {
		return proc_sha2;
	}

	public void setProc_sha2(String proc_sha2) {
		this.proc_sha2 = proc_sha2;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	

}
