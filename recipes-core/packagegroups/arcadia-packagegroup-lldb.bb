DESCRIPTION = "Arcadia lldb packagegroup"
SUMMARY = "Arcadia packagegroup - for using lldb"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
  lldb \
  lldb-server \
"