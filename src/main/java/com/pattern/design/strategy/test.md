老版本问题：
public class MovieTicket
    {
        public double Price
        {
            get;
            set;
        }
        public string Type { private get; set; }
        // 计算打折之后的票价
        public double Calculate()
        {
            // 学生票折后票价计算
            if (this.Type.Equals("student", StringComparison.OrdinalIgnoreCase))
            {
                Console.WriteLine("学生票：");
                return this.Price * 0.8;
            }
            // 儿童票折后票价计算
            else if (this.Type.Equals("children", StringComparison.OrdinalIgnoreCase))
            {
                Console.WriteLine("儿童票：");
                return this.Price - 10;
            }
            // VIP票折后票价计算
            else if (this.Type.Equals("vip", StringComparison.OrdinalIgnoreCase))
            {
                Console.WriteLine("VIP票：");
                Console.WriteLine("增加积分！");
                return this.Price * 0.5;
            }
            else
            {
                return this.Price; // 不满足任何条件则原价出售
            }
        }
    }
策略（Strategy）模式：定义一系列算法类，将每一个算法封装起来，
并让它们可以相互替换。策略模式让算法独立于使用它的客户而变化
主要优点：
　　避免了多重的if-else条件选择语句，利于系统的维护。
　　提供了一种算法的复用机制，不同的环境类可以方便地复用这些策略类。
应用场景：
　　如果一个系统要**动态地在几种算法之间选择其中一种**
　　如果有难以维护的多重if-else条件选择语句是为了实现对象的行为
　　不希望客户知道复杂的与算法有关的数据结构，可以将其封装到策略中
jdk使用：
java.util.Comparator函数接口的compare()方法
比较器的使用就是：先写一个比较器，然后对Arrays或者Collections排序的时候，
将写好的比较器作为参数传入排序的方法，就能实现按照比较器的规则