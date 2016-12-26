
// This file is an automatically generated Java binding. Do not modify as any
// change will likely be lost upon the next re-generation!

package SkyPet;

import org.ethereum.geth.*;
//import org.ethereum.geth.internal.*;


	public class SkyPet {
		// ABI is the input ABI used to generate the binding from.
		public final static String ABI = "[{\"constant\":false,\"inputs\":[],\"name\":\"kill\",\"outputs\":[],\"payable\":false,\"type\":\"function\"},{\"constant\":false,\"inputs\":[],\"name\":\"getRevenue\",\"outputs\":[],\"payable\":true,\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"_petid\",\"type\":\"bytes32\"},{\"name\":\"index\",\"type\":\"uint256\"}],\"name\":\"getAttribute\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"},{\"name\":\"\",\"type\":\"string\"}],\"payable\":false,\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"owner\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"costToAdd\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"_petid\",\"type\":\"bytes32\"}],\"name\":\"getNumberOfAttributes\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"_petid\",\"type\":\"bytes32\"},{\"name\":\"_attribute\",\"type\":\"string\"}],\"name\":\"addAttribute\",\"outputs\":[],\"payable\":true,\"type\":\"function\"},{\"inputs\":[],\"type\":\"constructor\"},{\"payable\":false,\"type\":\"fallback\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":false,\"name\":\"_petid\",\"type\":\"bytes32\"},{\"indexed\":false,\"name\":\"_attribute\",\"type\":\"string\"}],\"name\":\"attributeAdded\",\"type\":\"event\"}]";

		
			// BYTECODE is the compiled bytecode used for deploying new contracts.
			public final static byte[] BYTECODE = "6060604052600080546c0100000000000000000000000033810204600160a060020a03199091161790556105a9806100376000396000f3606060405236156100615760e060020a600035046341c0e1b5811461006e57806348d7d9eb1461009b5780636d665f20146100f15780638da5cb5b146101d1578063bd7c47ef146101e8578063cad36553146101fc578063fe9be4cc14610226575b34610002576102b7610002565b34610002576102b760005433600160a060020a03908116911614156102b957600054600160a060020a0316ff5b6102b760005433600160a060020a03908116911614156102b957600080546040516102b992600160a060020a039283169230163180156108fc02929091818181858888f19350505050155b80156105a657610002565b34610002576102bb6004356024356040805160208181018352600080835285815260019091529182208054849081101561000257906000526020600020906002020160005054600085815260016020526040902080548590811015610002579060005260206000209060020201600050600101600050808054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156103775780601f1061034c57610100808354040283529160200191610377565b3461000257610330600054600160a060020a031681565b346100025761021467016345785d8a000081565b34610002576004356000908152600160205260409020545b60408051918252519081900360200190f35b60408051602060046024803582810135601f81018590048502860185019096528585526102b7958335959394604494939290920191819084018382808284375094965050505050505067016345785d8a0000341061042a5760405161042e90600160a060020a0333169067016345785d89ffff19340180156108fc02916000818181858888f19350505050156100e6565b005b565b60405180838152602001806020018281038252838181518152602001915080519060200190808383829060006004602084601f0104600302600f01f150905090810190601f1680156103215780820380516001836020036101000a031916815260200191505b50935050505060405180910390f35b60408051600160a060020a039092168252519081900360200190f35b820191906000526020600020905b81548152906001019060200180831161035a57829003601f168201915b50505050509050915091509250929050565b50505050507f093f4825a54e577374952fbae2d31cb2c3ae3dbd0cb43a924715746efc9bd1a782826040518083600019168152602001806020018281038252838181518152602001915080519060200190808383829060006004602084601f0104600302600f01f150905090810190601f16801561041b5780820380516001836020036101000a031916815260200191505b50935050505060405180910390a15b5050565b600082815260016020819052604090912080549182018082559091908281838015829011610475576002028160020283600052602060002091820191016104759190610503565b5050506000928352602080842060408051808201909152428082528184018890526002958602909201918255865160018084018054818a5298869020969893979496909591841615610100026000190190931693909304601f90810184900483019391929189019083901061057657805160ff19168380011785555b5061038992915061055e565b50506002015b80821115610572576000600082016000506000905560018201600050805460018160011615610100020316600290046000825580601f1061054457506104fd565b601f0160209004906000526020600020908101906104fd91905b80821115610572576000815560010161055e565b5090565b828001600101855582156104f1579182015b828111156104f1578251826000505591602001919060010190610588565b5056".getBytes();

			// deploy deploys a new Ethereum contract, binding an instance of SkyPet to it.
			public static SkyPet deploy(TransactOpts auth, EthereumClient client) throws Exception {
				Interfaces args = Geth.newInterfaces(0);
				
				return new SkyPet(Geth.deployContract(auth, ABI, BYTECODE, client, args));
			}

			// Internal constructor used by contract deployment.
			private SkyPet(BoundContract deployment) {
				this.Address  = deployment.getAddress();
				this.Deployer = deployment.getDeployer();
				this.Contract = deployment;
			}
		

		// Ethereum address where this contract is located at.
		public final Address Address;

		// Ethereum transaction in which this contract was deployed (if known!).
		public final Transaction Deployer;

		// Contract instance bound to a blockchain address.
		private final BoundContract Contract;

		// Creates a new instance of SkyPet, bound to a specific deployed contract.
		public SkyPet(Address address, EthereumClient client) throws Exception {
			this(Geth.bindContract(address, ABI, client));
		}

		
			

			// costToAdd is a free data retrieval call binding the contract method 0xbd7c47ef.
			//
			// Solidity: function costToAdd() constant returns(uint256)
			public BigInt costToAdd(CallOpts opts) throws Exception {
				Interfaces args = Geth.newInterfaces(0);
				

				Interfaces results = Geth.newInterfaces(1);
				Interface result0 = Geth.newInterface(); result0.setDefaultBigInt(); results.set(0, result0);
				

				if (opts == null) {
					opts = Geth.newCallOpts();
				}
				this.Contract.call(opts, results, "costToAdd", args);
				return results.get(0).getBigInt();
				
			}
		
			
			// GetAttributeResults is the output of a call to getAttribute.
			public class GetAttributeResults {
				public BigInt Return0;
				public String Return1;
				
			}
			

			// getAttribute is a free data retrieval call binding the contract method 0x6d665f20.
			//
			// Solidity: function getAttribute(_petid bytes32, index uint256) constant returns(uint256, string)
			public GetAttributeResults getAttribute(CallOpts opts, byte[] _petid, BigInt index) throws Exception {
				Interfaces args = Geth.newInterfaces(2);
				args.set(0, Geth.newInterface()); args.get(0).setBinary(_petid);
				args.set(1, Geth.newInterface()); args.get(1).setBigInt(index);
				

				Interfaces results = Geth.newInterfaces(2);
				Interface result0 = Geth.newInterface(); result0.setDefaultBigInt(); results.set(0, result0);
				Interface result1 = Geth.newInterface(); result1.setDefaultString(); results.set(1, result1);
				

				if (opts == null) {
					opts = Geth.newCallOpts();
				}
				this.Contract.call(opts, results, "getAttribute", args);
				
					GetAttributeResults result = new GetAttributeResults();
					result.Return0 = results.get(0).getBigInt();
					result.Return1 = results.get(1).getString();
					
					return result;
				
			}
		
			

			// getNumberOfAttributes is a free data retrieval call binding the contract method 0xcad36553.
			//
			// Solidity: function getNumberOfAttributes(_petid bytes32) constant returns(uint256)
			public BigInt getNumberOfAttributes(CallOpts opts, byte[] _petid) throws Exception {
				Interfaces args = Geth.newInterfaces(1);
				args.set(0, Geth.newInterface()); args.get(0).setBinary(_petid);
				

				Interfaces results = Geth.newInterfaces(1);
				Interface result0 = Geth.newInterface(); result0.setDefaultBigInt(); results.set(0, result0);
				

				if (opts == null) {
					opts = Geth.newCallOpts();
				}
				this.Contract.call(opts, results, "getNumberOfAttributes", args);
				return results.get(0).getBigInt();
				
			}
		
			

			// owner is a free data retrieval call binding the contract method 0x8da5cb5b.
			//
			// Solidity: function owner() constant returns(address)
			public Address owner(CallOpts opts) throws Exception {
				Interfaces args = Geth.newInterfaces(0);
				

				Interfaces results = Geth.newInterfaces(1);
				Interface result0 = Geth.newInterface(); result0.setDefaultAddress(); results.set(0, result0);
				

				if (opts == null) {
					opts = Geth.newCallOpts();
				}
				this.Contract.call(opts, results, "owner", args);
				return results.get(0).getAddress();
				
			}
		

		
			// addAttribute is a paid mutator transaction binding the contract method 0xfe9be4cc.
			//
			// Solidity: function addAttribute(_petid bytes32, _attribute string) returns()
			public Transaction addAttribute(TransactOpts opts, byte[] _petid, String _attribute) throws Exception {
				Interfaces args = Geth.newInterfaces(2);
				args.set(0, Geth.newInterface()); args.get(0).setBinary(_petid);
				args.set(1, Geth.newInterface()); args.get(1).setString(_attribute);
				

				return this.Contract.transact(opts, "addAttribute"	, args);
			}
		
			// getRevenue is a paid mutator transaction binding the contract method 0x48d7d9eb.
			//
			// Solidity: function getRevenue() returns()
			public Transaction getRevenue(TransactOpts opts) throws Exception {
				Interfaces args = Geth.newInterfaces(0);
				

				return this.Contract.transact(opts, "getRevenue"	, args);
			}
		
			// kill is a paid mutator transaction binding the contract method 0x41c0e1b5.
			//
			// Solidity: function kill() returns()
			public Transaction kill(TransactOpts opts) throws Exception {
				Interfaces args = Geth.newInterfaces(0);
				

				return this.Contract.transact(opts, "kill"	, args);
			}
		
	}

