
// This file is an automatically generated Java binding. Do not modify as any
// change will likely be lost upon the next re-generation!

package com.example.dstahl.gethagain;

import org.ethereum.geth.*;
//import org.ethereum.geth.internal.*;


	public class SkyPet {
		// ABI is the input ABI used to generate the binding from.
		public final static String ABI = "[{\"constant\":true,\"inputs\":[{\"name\":\"\",\"type\":\"bytes32\"}],\"name\":\"trackNumberRecords\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"_petid\",\"type\":\"bytes32\"},{\"name\":\"_type\",\"type\":\"uint256\"},{\"name\":\"_attribute\",\"type\":\"string\"},{\"name\":\"_isEncrypted\",\"type\":\"bool\"}],\"name\":\"addAttribute\",\"outputs\":[],\"type\":\"function\"},{\"constant\":false,\"inputs\":[],\"name\":\"kill\",\"outputs\":[],\"type\":\"function\"},{\"constant\":false,\"inputs\":[],\"name\":\"getRevenue\",\"outputs\":[],\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"\",\"type\":\"bytes32\"},{\"name\":\"\",\"type\":\"uint256\"}],\"name\":\"pet\",\"outputs\":[{\"name\":\"timestamp\",\"type\":\"uint256\"},{\"name\":\"typeAttribute\",\"type\":\"uint256\"},{\"name\":\"attributeText\",\"type\":\"string\"},{\"name\":\"isEncrypted\",\"type\":\"bool\"}],\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"owner\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"costToAdd\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"type\":\"function\"},{\"inputs\":[],\"type\":\"constructor\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":false,\"name\":\"_petid\",\"type\":\"bytes32\"},{\"indexed\":false,\"name\":\"_type\",\"type\":\"uint256\"}],\"name\":\"attributeAdded\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":false,\"name\":\"_petid\",\"type\":\"bytes32\"},{\"indexed\":false,\"name\":\"error\",\"type\":\"string\"}],\"name\":\"attributeError\",\"type\":\"event\"}];";

		

		// Ethereum address where this contract is located at.
		public Address Address;

		// Ethereum transaction in which this contract was deployed (if known!).
		public Transaction Deployer;

		// Contract instance bound to a blockchain address.
		private BoundContract Contract;

		// Creates a new instance of SkyPet, bound to a specific deployed contract.
		public SkyPet(Address address, EthereumClient client) throws Exception {
			Contract=Geth.bindContract(address, ABI, client);
			//Address=address;
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
				public boolean IsEncrypted;
				
			}
			

			// pet is a free data retrieval call binding the contract method 0x49bd3632.
			//
			// Solidity: function pet( bytes32,  uint256) constant returns(timestamp uint256, typeAttribute uint256, attributeText string, isEncrypted bool)
			public PetResults pet(CallOpts opts, byte[] arg0, BigInt arg1) throws Exception {
				Interfaces args = Geth.newInterfaces(2);
				args.set(0, Geth.newInterface()); args.get(0).setBinary(arg0);
				args.set(1, Geth.newInterface()); args.get(1).setBigInt(arg1);
				

				Interfaces results = Geth.newInterfaces(4);
				Interface result0 = Geth.newInterface(); result0.setDefaultBigInt(); results.set(0, result0);
				Interface result1 = Geth.newInterface(); result1.setDefaultBigInt(); results.set(1, result1);
				Interface result2 = Geth.newInterface(); result2.setDefaultString(); results.set(2, result2);
				Interface result3 = Geth.newInterface(); result3.setDefaultBool(); results.set(3, result3);
				

				if (opts == null) {
					opts = Geth.newCallOpts();
				}
				this.Contract.call(opts, results, "pet", args);
				
					PetResults result = new PetResults();
					result.Timestamp = results.get(0).getBigInt();
					result.TypeAttribute = results.get(1).getBigInt();
					result.AttributeText = results.get(2).getString();
					result.IsEncrypted = results.get(3).getBool();
					
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
		

		
			// addAttribute is a paid mutator transaction binding the contract method 0x3e964608.
			//
			// Solidity: function addAttribute(_petid bytes32, _type uint256, _attribute string, _isEncrypted bool) returns()
			public Transaction addAttribute(TransactOpts opts, byte[] _petid, BigInt _type, String _attribute, boolean _isEncrypted) throws Exception {
				Interfaces args = Geth.newInterfaces(4);
				args.set(0, Geth.newInterface()); args.get(0).setBinary(_petid);
				args.set(1, Geth.newInterface()); args.get(1).setBigInt(_type);
				args.set(2, Geth.newInterface()); args.get(2).setString(_attribute);
				args.set(3, Geth.newInterface()); args.get(3).setBool(_isEncrypted);
				

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

