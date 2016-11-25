
// This file is an automatically generated Java binding. Do not modify as any
// change will likely be lost upon the next re-generation!

package SkyPet;

import org.ethereum.geth.*;
//import org.ethereum.geth.internal.*;


	public class SkyPet {
		// ABI is the input ABI used to generate the binding from.
		public final static String ABI = "[{\"constant\":true,\"inputs\":[{\"name\":\"\",\"type\":\"bytes32\"}],\"name\":\"trackNumberRecords\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"type\":\"function\"},{\"constant\":false,\"inputs\":[],\"name\":\"kill\",\"outputs\":[],\"payable\":false,\"type\":\"function\"},{\"constant\":false,\"inputs\":[],\"name\":\"getRevenue\",\"outputs\":[],\"payable\":false,\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"\",\"type\":\"bytes32\"},{\"name\":\"\",\"type\":\"uint256\"}],\"name\":\"pet\",\"outputs\":[{\"name\":\"timestamp\",\"type\":\"uint256\"},{\"name\":\"typeAttribute\",\"type\":\"uint8\"},{\"name\":\"attributeText\",\"type\":\"string\"}],\"payable\":false,\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"collectedRevenue\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"owner\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"type\":\"function\"},{\"constant\":false,\"inputs\":[],\"name\":\"isOwner\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"costToAdd\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"_petid\",\"type\":\"bytes32\"},{\"name\":\"_type\",\"type\":\"uint8\"},{\"name\":\"_attribute\",\"type\":\"string\"}],\"name\":\"addAttribute\",\"outputs\":[],\"payable\":false,\"type\":\"function\"},{\"inputs\":[],\"payable\":false,\"type\":\"constructor\"},{\"payable\":false,\"type\":\"fallback\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":false,\"name\":\"_petid\",\"type\":\"bytes32\"},{\"indexed\":false,\"name\":\"_type\",\"type\":\"uint8\"},{\"indexed\":false,\"name\":\"_attribute\",\"type\":\"string\"}],\"name\":\"attributeAdded\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":false,\"name\":\"_petid\",\"type\":\"bytes32\"},{\"indexed\":false,\"name\":\"error\",\"type\":\"string\"}],\"name\":\"attributeError\",\"type\":\"event\"}]";

		
			// BYTECODE is the compiled bytecode used for deploying new contracts.
			public final static byte[] BYTECODE = "0x606060405236156100615760e060020a60003504633d75f38e81146100695780633e9646081461008157806341c0e1b51461014c57806348d7d9eb1461017457806349bd3632146101b55780638da5cb5b146101ec578063bd7c47ef146101fe575b61020d610002565b61021160043560026020526000908152604090205481565b604080516020604435600481810135601f810184900484028501840190955284845261020d9481359460248035959394606494929391019181908401838280828437509496505093359350505050600067016345785d8a000034101561033f5760408051868152602081018290526010818301527f546f6f206c6974746c6520457468657200000000000000000000000000000000606082015290517f6398430e477977a735def2d6ebd67c4150d45f71afa942462e80c6fb93eacc679181900360800190a1610338565b61020d60005433600160a060020a039081169116141561020f57600054600160a060020a0316ff5b61020d60005433600160a060020a039081169116141561020f5760008054604051600160a060020a0391821692913016319082818181858883f15050505050565b6001602081815260043560009081526040808220909252602435815220805491810154600382015461022393926002019060ff1684565b6102c4600054600160a060020a031681565b61021167016345785d8a000081565b005b565b60408051918252519081900360200190f35b604080518581526020810185905282151560608201526080918101828152845460026001821615610100026000190190911604928201839052909160a0830190859080156102b25780601f10610287576101008083540402835291602001916102b2565b820191906000526020600020905b81548152906001019060200180831161029557829003601f168201915b50509550505050505060405180910390f35b60408051600160a060020a03929092168252519081900360200190f35b505060609190910151600391909101805460ff191690911790555b604080518681526020810186905281517f30fc589131c3a81872fe9533fe7171a6abdff19eed25678440984470564b1ef8929181900390910190a15b5050505050565b5067016345785d89ffff19340160008111156103765760405133600160a060020a031690600090839082818181858883f150505050505b600085815260026020526040812054111561043857604060008181205482516080810184524281526020818101898152828601898152606084018990528b8652600180845287872095875294835295852083518155905181850155945180516002878101805481895297859020959897909681161561010002600019011604601f90810184900485019491939192909101908390106104e257805160ff19168380011785555b506105129291505b808211156105465760008155600101610424565b600085815260026020818152604080842060019081905581516080810183524281528084018a81528184018a8152606083018a90528c8852838652848820888052865293872082518155905181840155925180518487018054818a529887902093989597909694861615610100026000190190951694909404601f90810184900483019493919091019083901061054a57805160ff19168380011785555b506102e1929150610424565b8280016001018555821561041c579182015b8281111561041c5782518260005055916020019190600101906104f4565b505060609190910151600391909101805460ff191690911790556000858152600260205260409020805460010190556102fc565b5090565b828001600101855582156104d6579182015b828111156104d657825182600050559160200191906001019061055c56".getBytes();

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

		
			

			// collectedRevenue is a free data retrieval call binding the contract method 0x8108fd0c.
			//
			// Solidity: function collectedRevenue() constant returns(uint256)
			public BigInt collectedRevenue(CallOpts opts) throws Exception {
				Interfaces args = Geth.newInterfaces(0);
				

				Interfaces results = Geth.newInterfaces(1);
				Interface result0 = Geth.newInterface(); result0.setDefaultBigInt(); results.set(0, result0);
				

				if (opts == null) {
					opts = Geth.newCallOpts();
				}
				this.Contract.call(opts, results, "collectedRevenue", args);
				return results.get(0).getBigInt();
				
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
		
			
			// PetResults is the output of a call to pet.
			public class PetResults {
				public BigInt Timestamp;
				public BigInt TypeAttribute;
				public String AttributeText;
				
			}
			

			// pet is a free data retrieval call binding the contract method 0x49bd3632.
			//
			// Solidity: function pet( bytes32,  uint256) constant returns(timestamp uint256, typeAttribute uint8, attributeText string)
			public PetResults pet(CallOpts opts, byte[] arg0, BigInt arg1) throws Exception {
				Interfaces args = Geth.newInterfaces(2);
				args.set(0, Geth.newInterface()); args.get(0).setBinary(arg0);
				args.set(1, Geth.newInterface()); args.get(1).setBigInt(arg1);
				

				Interfaces results = Geth.newInterfaces(3);
				Interface result0 = Geth.newInterface(); result0.setDefaultBigInt(); results.set(0, result0);
				Interface result1 = Geth.newInterface(); result1.setDefaultUint8(); results.set(1, result1);
				Interface result2 = Geth.newInterface(); result2.setDefaultString(); results.set(2, result2);
				

				if (opts == null) {
					opts = Geth.newCallOpts();
				}
				this.Contract.call(opts, results, "pet", args);
				
					PetResults result = new PetResults();
					result.Timestamp = results.get(0).getBigInt();
					result.TypeAttribute = results.get(1).getUint8();
					result.AttributeText = results.get(2).getString();
					
					return result;
				
			}
		
			

			// trackNumberRecords is a free data retrieval call binding the contract method 0x3d75f38e.
			//
			// Solidity: function trackNumberRecords( bytes32) constant returns(uint256)
			public BigInt trackNumberRecords(CallOpts opts, byte[] arg0) throws Exception {
				Interfaces args = Geth.newInterfaces(1);
				args.set(0, Geth.newInterface()); args.get(0).setBinary(arg0);
				

				Interfaces results = Geth.newInterfaces(1);
				Interface result0 = Geth.newInterface(); result0.setDefaultBigInt(); results.set(0, result0);
				

				if (opts == null) {
					opts = Geth.newCallOpts();
				}
				this.Contract.call(opts, results, "trackNumberRecords", args);
				return results.get(0).getBigInt();
				
			}
		

		
			// addAttribute is a paid mutator transaction binding the contract method 0xe6723ac2.
			//
			// Solidity: function addAttribute(_petid bytes32, _type uint8, _attribute string) returns()
			public Transaction addAttribute(TransactOpts opts, byte[] _petid, BigInt _type, String _attribute) throws Exception {
				Interfaces args = Geth.newInterfaces(3);
				args.set(0, Geth.newInterface()); args.get(0).setBinary(_petid);
				args.set(1, Geth.newInterface()); args.get(1).setUint8(_type);
				args.set(2, Geth.newInterface()); args.get(2).setString(_attribute);
				

				return this.Contract.transact(opts, "addAttribute"	, args);
			}
		
			// getRevenue is a paid mutator transaction binding the contract method 0x48d7d9eb.
			//
			// Solidity: function getRevenue() returns()
			public Transaction getRevenue(TransactOpts opts) throws Exception {
				Interfaces args = Geth.newInterfaces(0);
				

				return this.Contract.transact(opts, "getRevenue"	, args);
			}
		
			// isOwner is a paid mutator transaction binding the contract method 0x8f32d59b.
			//
			// Solidity: function isOwner() returns(bool)
			public Transaction isOwner(TransactOpts opts) throws Exception {
				Interfaces args = Geth.newInterfaces(0);
				

				return this.Contract.transact(opts, "isOwner"	, args);
			}
		
			// kill is a paid mutator transaction binding the contract method 0x41c0e1b5.
			//
			// Solidity: function kill() returns()
			public Transaction kill(TransactOpts opts) throws Exception {
				Interfaces args = Geth.newInterfaces(0);
				

				return this.Contract.transact(opts, "kill"	, args);
			}
		
	}

