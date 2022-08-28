DESCRIPTION = "Arcadia lldb packagegroup"
SUMMARY = "Arcadia packagegroup - for using lldb"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
  python3 \
  python3-pip \
  python3-six \
  lldb \
  lldb-server \
"