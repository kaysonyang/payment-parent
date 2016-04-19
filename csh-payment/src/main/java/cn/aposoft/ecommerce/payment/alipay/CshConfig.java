package cn.aposoft.ecommerce.payment.alipay;

/**
 * 彩之云支付账号配置接口
 * 
 * @author Yu Jinshui
 * @createTime 2016年4月19日 下午11:20:41
 */
public interface CshConfig {
	/**
	 * 合作方编号，由合作方统一分配
	 *
	 * @return
	 * @Author Yu Jinshui
	 * @createTime 2016年4月19日 下午11:32:20
	 */
	String key();

	/**
	 * api版本,默认1
	 *
	 * @return
	 * @Author Yu Jinshui
	 * @createTime 2016年4月19日 下午11:32:32
	 */
	String ve();

	/**
	 * 密钥，由合作方统一分配
	 * <p>
	 * secret不明码传递，只作为参数生成sign
	 *
	 * @return
	 * @Author Yu Jinshui
	 * @createTime 2016年4月19日 下午11:32:49
	 */
	String secret();

	/**
	 * 用户编号
	 * <p>
	 * 唯一代表某一用户，可通过这一编号查询用户详细信息
	 *
	 * @return
	 * @Author Yu Jinshui
	 * @createTime 2016年4月19日 下午11:33:12
	 */
	String cid();

}
