function Proto() {}
Proto.prototype = {
 constructor: Proto,
 number: "unknown",
 protoObj: ["A","B"],
};
let proto1 = new Proto();
let proto2 = new Proto();
let proto3 = new Proto();
// 在Proto1中引入protoObj属性，与原型中的protoObj无关，互不影响
proto1.protoObj = ["C"];
for (let i=0; i<proto1.protoObj.length; i++) {
  console.log(proto1.protoObj[i]);// 只有C
}
for (let i=0; i<proto3.protoObj.length; i++) {
    console.log(proto3.protoObj[i]);// A、B
}
// 未初始化proto2的protoObj属性，直接对protoObj进行修改。直接调整了原型链上的protoObj属性
proto2.protoObj.push("D");
proto2.protoObj[0] = "E";
for (let i=0; i<proto2.protoObj.length; i++) {
    console.log(proto2.protoObj[i]);// E、B、D
}
for (let i=0; i<proto3.protoObj.length; i++) {
    console.log(proto3.protoObj[i]);// E、B、D
}